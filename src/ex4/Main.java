package ex4;

public class Main {
    public static void main(String[] args) {
        // Test MovablePoint
        System.out.println("Testing MovablePoint:");
        MovablePoint point = new MovablePoint(1, 2, 3, 4);
        System.out.println("Original point: " + point);
        point.moveUp();
        System.out.println("After moving up: " + point);
        point.moveLeft();
        System.out.println("After moving left: " + point);

        // Test MovableCircle
        System.out.println("\nTesting MovableCircle:");
        MovableCircle circle = new MovableCircle(5, 6, 2, 3, 10);
        System.out.println("Original circle: " + circle);
        circle.moveDown();
        System.out.println("After moving down: " + circle);
        circle.moveRight();
        System.out.println("After moving right: " + circle);
    }
}

