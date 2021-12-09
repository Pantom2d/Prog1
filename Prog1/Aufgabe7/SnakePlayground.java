package Prog1.Aufgabe7;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class SnakePlayground extends JFrame {
	private GameBoard field;
	private JPanel canvas;
	private JLabel currentLabel;
	private JLabel maxPoints;
	private Direction nextDirection;
	
	public SnakePlayground(GameBoard field, int stepDelay) {
		this.field = field;
		
		currentLabel = new JLabel("");
		maxPoints = new JLabel("");
        canvas = new DisplayArea(field);
        
        
        getContentPane().add("Center", canvas);
        getContentPane().add("North", currentLabel);
        getContentPane().add("South", maxPoints);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        this.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {}

			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				switch ( keyCode ) {
				case KeyEvent.VK_UP:
					nextDirection = new Direction(Direction.UP);
					break;
				case KeyEvent.VK_DOWN:
					nextDirection = new Direction(Direction.DOWN);
					break;
				case KeyEvent.VK_LEFT:
					nextDirection = new Direction(Direction.LEFT);
					break;
				case KeyEvent.VK_RIGHT:
					nextDirection = new Direction(Direction.RIGHT);
					break;
				default:
					nextDirection = new Direction(-1);
					break;
				}
				System.out.println("New direction: " + nextDirection);

			}

			@Override
			public void keyReleased(KeyEvent e) {}
        });
		
		Thread t1 = new Thread(() -> {
			while (true) {
				update();
				try {
					Thread.sleep(stepDelay);
				} catch (InterruptedException e) {}
			}
		});
		t1.start();
	}
	
	private synchronized void update() {
		field.moveSnake(nextDirection);
		nextDirection = null;
		currentLabel.setText("Current Score: " + field.getCurrentPoints() 
		                     + " - Current Direction: " + field.getCurrentSnakeDirection());
		maxPoints.setText("Max Score: " + field.getMaxPoints());
		canvas.repaint();
	}
}

@SuppressWarnings("serial")
class DisplayArea extends JPanel {
	private GameBoard field;
	
	public DisplayArea(GameBoard field) {
		this.field = field;
	}
	
	protected void paintComponent(Graphics g)  {
		g.setColor(getBackground());
    	g.fillRect(0,0,getWidth(),getHeight());
    	
    	g.setColor(Color.black);
    	
    	int squareHeight = getHeight() / field.getRows();
    	int squareWidth  = getWidth() / field.getCols();

    	int marginHeight = (getHeight() - squareHeight * field.getRows())/2;
    	int marginWidth = (getWidth() - squareWidth * field.getCols())/2;

    	for (int x = 0; x != field.getCols(); ++x) {
    		for (int y = 0; y != field.getRows(); ++y) {
    			int squareType = field.getFieldContent(x, y);
    			if (squareType == GameBoard.EMPTY) {
    				g.setColor(Color.black);
    				g.drawRect(marginWidth + x*squareWidth, marginHeight + y*squareHeight, squareWidth, squareHeight);
    				continue;
    			}
    			if (squareType == GameBoard.FOOD)
    				g.setColor(Color.red);
    			if (squareType == GameBoard.SNAKEHEAD)
    				g.setColor(Color.black);
    			if (squareType == GameBoard.SNAKEBODY)
    				g.setColor(Color.green);
    			g.fillRect(marginWidth + x*squareWidth, marginHeight + y*squareHeight, squareWidth, squareHeight);
    		}
    	}
	}
}
