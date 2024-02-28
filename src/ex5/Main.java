package ex5;

public class Main {
    public static void main(String[] args) {
        // Create a circle with radius 5
        Circle circle = new Circle(5);
        System.out.println("Circle:");
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        // Create a resizable circle with radius 3
        ResizeableCircle resizableCircle = new ResizeableCircle(3);
        System.out.println("\nResizable Circle (before resizing):");
        System.out.println(resizableCircle);

        // Resize the resizable circle
        resizableCircle.resize(200);
        System.out.println("\nResizable Circle (after resizing):");
        System.out.println(resizableCircle);
    }
}
