package laba4.n2_3;

import java.util.Scanner;

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
        if (height <= 0) {
            throw new IncorrectRectangleException("Высота должна быть больше 0. Текущее значение: " + height);
        }
        if (width <= 0) {
            throw new IncorrectRectangleException("Ширина должна быть больше 0. Текущее значение: " + width);
        }

        this.x1 = 0;
        this.y1 = 0;
        this.x2 = width;
        this.y2 = height;
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

    public void inCons() {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите х1: ");
        String x1 = in.nextLine();

        System.out.print("Введите y1: ");
        String y1 = in.nextLine();

        System.out.print("Введите х2: ");
        String x2 = in.nextLine();

        System.out.print("Введите y2: ");
        String y2 = in.nextLine();

        try {
            this.x1 = Integer.parseInt(x1);
            this.y1 = Integer.parseInt(y1);
            this.x2 = Integer.parseInt(x2);
            this.y2 = Integer.parseInt(y2);
        } catch (
                NumberFormatException e) {
            System.out.println("Не число");
        }
    }

    @Override
    public String toString() {
        return "x1 = " + x1 + ", y1 = " + y1 + ", x2 = " + x2 + ", y2 = " + y2;
    }

    private int calcSquare() {
        try {
            return (this.x2 - this.x1) * (this.y2 - this.y1);
        } catch (ArithmeticException e) {
            System.out.println("Некоректное значение");
        }
        return -1;
    }

}
