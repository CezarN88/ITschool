package session15.challenges.equals_hashcode;

import java.util.Objects;

public class Rectangle {

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return width == rectangle.width && height == rectangle.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(10, 20);
        Rectangle rectangle2 = new Rectangle(10, 20);

        System.out.println("rectangle1 equals rectangle2: " + rectangle1.equals(rectangle2));

        System.out.println("Hashcode of rectangle1: " + rectangle1.hashCode());
        System.out.println("Hashcode of rectangle2: " + rectangle2.hashCode());
    }
}