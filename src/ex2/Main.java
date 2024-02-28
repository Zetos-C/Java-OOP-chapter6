package ex2;

public class Main {
	public static void main(String[] args) {
        // Creating a Circle object
        GeometricObject circle = new Circle(5.0);
        System.out.println("Circle:");
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        // Creating a Rectangle object
        GeometricObject rectangle = new Rectangle(4.0, 6.0);
        System.out.println("\nRectangle:");
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
    }
}
