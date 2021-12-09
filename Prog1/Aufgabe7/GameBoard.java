package Prog1.Aufgabe7;

import java.util.Random;

public class GameBoard {
	public static final int EMPTY = 0;
	public static final int SNAKEHEAD = 1;
	public static final int SNAKEBODY = 2;
	public static final int FOOD = 3;
	
	private int cols, rows;
	private Snake snake;
	private Random random = new Random();
	private int foodX, foodY;
	private int currentPoints;
	private int maxPoints;
	
	public GameBoard(int cols, int rows) {
		this.cols = cols;
		this.rows = rows;
		snake = new Snake(cols-1, 0, new Direction());
		setRandomFoodPosition();
	}
	
	public void setRandomFoodPosition() {
		// TODO

	}
	
	public int getRows() { 
		return rows; 
	}
	
	public int getCols() { 
		return cols; 
	}
	
	public int getCurrentPoints() { 
		return currentPoints;
	}

	public int getMaxPoints() { 
		return maxPoints;
	}
	
	private void resetPoints() {
		// TODO
	}
	
	public void moveSnake(Direction newDirection) {
		// TODO
	}
	
	/**
	 * Gets called by the renderer and returns which 
	 * element is on the playing field. 
	 */
	public int getFieldContent(int x, int y) {
		if (snake.hasHead(x, y))
			return SNAKEHEAD;
		if (snake.hasBody(x, y))
			return SNAKEBODY;
		if (x == foodX && y == foodY)
			return FOOD;
		
		return EMPTY;
	}

	public Direction getCurrentSnakeDirection() {
		return snake.getDirection();
	}
}
