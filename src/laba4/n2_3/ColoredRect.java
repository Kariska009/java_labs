package laba4.n2_3;

public class ColoredRect extends DrawRect {
	private String inColor;

	public ColoredRect(int x1, int y1, int x2, int y2) {
		super(x1, y1, x2, y2);
	}

	public void draw(String outColor, String inColor) {
		this.draw(outColor);
		this.inColor = inColor;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", inColor = " + this.inColor;
	}
}
