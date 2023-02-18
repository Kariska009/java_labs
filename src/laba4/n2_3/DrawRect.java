package laba4.n2_3;

public class DrawRect extends Rectangle {
	private String outColor;
	
	public DrawRect(int x1, int y1, int x2, int y2) {
		super(x1, y1, x2, y2);
	}
	
	public void draw(String outColor) {
		this.outColor = outColor;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", outColor = " + this.outColor;
	}
	
}
