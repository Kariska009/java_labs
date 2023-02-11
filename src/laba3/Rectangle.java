package laba3;

public class Rectangle {
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	
	public Rectangle(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	public Rectangle(int height, int width) {
		this(0, 0, width, height);
	}
	
	public Rectangle() {
		this(0, 0, 0, 0);
	}
	
	public void move(int dx, int dy) {
		this.x1 += dx;
		this.x2 += dx;
		this.y1 += dy;
		this.y2 += dy;
	}
	
	public Rectangle minSquare(Rectangle other) {
		if (this.calcSquare() > other.calcSquare()) {
			return other;
		}
		return this;
	}
	
	@Override
	public String toString() {
		return "x1 = " + x1 + ", y1 = " + y1 + ", x2 = " + x2 + ", y2 = " + y2;
	}
	
	private int calcSquare() {
		return (this.x2 - this.x1) * (this.y2 - this.y1);
	}
	
}
