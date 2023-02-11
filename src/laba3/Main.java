package laba3;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle(10, 10, 15, 15);
		Rectangle rectangle2 = new Rectangle(5, 5);
		Rectangle rectangle3 = new Rectangle();
	
		System.out.println("Rectangle 1: " + rectangle1);
		System.out.println("Rectangle 2: " + rectangle2);
		System.out.println("Rectangle 3: " + rectangle3);
		
		System.out.println();
		System.out.println("Move Rectangle 1 on dx = 5, dy = 5");
		rectangle1.move(5, 5);
		System.out.println("Move Rectangle 2 on dx = 10, dy = 10");
		rectangle2.move(10, 10);
		System.out.println("Move Rectangle 3 on dx = 20, dy = 20");
		rectangle3.move(20, 20);
		
		System.out.println();
		System.out.println("Rectangle 1: " + rectangle1);
		System.out.println("Rectangle 2: " + rectangle2);
		System.out.println("Rectangle 3: " + rectangle3);
		System.out.println();
		
		Rectangle minSquareRectangle = rectangle1.minSquare(rectangle2);
		System.out.println("Print rectangle with min square: " + minSquareRectangle);
		
		DrawRect drawRect = new DrawRect(10, 10, 15, 15);
		
		Scanner in = new Scanner(System.in);
		System.out.println("Введите цвет границы прямоугольника:");
		String outColor = in.nextLine();
		drawRect.draw(outColor);
		System.out.println("Draw Rect: " + drawRect);
		
		ColoredRect coloredRect = new ColoredRect(10, 4, 12, 6);
		System.out.println("Введите цвет прямоугольника:");
		String inColor = in.nextLine();
		coloredRect.draw(outColor, inColor);
		System.out.println("Colored Rect: " + coloredRect);
	}
	
}
