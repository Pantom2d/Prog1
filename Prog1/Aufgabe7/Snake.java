package Prog1.Aufgabe7;

public class Snake {
	private SnakePart head;
	private Direction direction;
	private boolean extendBody = false;
	
	public Snake(int headX, int headY, Direction direction) {
		head = new SnakePart(headX, headY, null, null);
		this.direction = direction;
	}
	
	public void extendBody() {
		extendBody = true;
	}
	
	public void setDirection(Direction direction) {
		this.direction = direction;
	}
	
	public Direction getDirection() { 
		return this.direction; 
	}
	
	public void moveSnake() {		
		// TODO
	}
	
	private int calculateNewX() {
		// TODO
		return 0;
	}

	private int calculateNewY() {
		// TODO
		return 0;
	}

	public int getHeadX() {
		return head.getX(); 
	}
	
	public int getHeadY() {
		return head.getY();
	}
	
	/*
	 * Returns if the head of the snake is on position (x, y)
	 */
	public boolean hasHead(int x, int y) {
		return x == getHeadX() && y == getHeadY();
	}
	
	public boolean hasBody(int x, int y) {
		// TODO
		return false;
	}
}

class SnakePart {
	private SnakePart prev;
	private SnakePart next;
	private int x, y;
	
	public SnakePart(int x, int y, SnakePart prev, SnakePart next) {
		this.x = x;
		this.y = y;
		this.prev = prev;
		this.next = next;
	}
	
	public boolean hasNext() {
		return next != null;
	}
	
	public SnakePart getPrev() { 
		return prev; 
	}
	public SnakePart getNext() { 
		return next; 
	}
	
	public void setPrev(SnakePart p) { 
		prev = p; 
	}
	public void setNext(SnakePart n) { 
		next = n; 
	}
	
	public int getX() { 
		return x; 
	}
	public int getY() { 
		return y; 
	}
	
}