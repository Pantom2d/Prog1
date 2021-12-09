package Prog1.Aufgabe7;

public class SnakeGame {
	public static final int STEP_DELAY = 200;
	public static final int SIZE_COLS = 20;
	public static final int SIZE_ROWS = 20;
	
	public static void main(String[] args) {
		SnakePlayground playground = new SnakePlayground(new GameBoard(SIZE_COLS, SIZE_ROWS), STEP_DELAY);
		playground.setSize(800, 600);
		playground.setVisible(true);

	}
}
