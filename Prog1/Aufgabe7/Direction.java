package Prog1.Aufgabe7;

import java.util.Random;

public class Direction {
	public static final int UP = 0;
	public static final int DOWN = 1;
	public static final int LEFT = 2;
	public static final int RIGHT = 3;
	private static Random rand = new Random();
	private int d;

	public Direction(int d) {
		this.d = d;
	}

	public Direction() {
		this(rand.nextInt(4));
	}

	public int getDirection() {
		return this.d;
	}

	public String toString() {
		switch (this.d) {
			case 0:
				return "UP";
			case 1:
				return "DOWN";
			case 2:
				return "Left";
			case 3:
				return "RIGHT";
			default:
				return "Wrong input";
		}
		
	}
}
