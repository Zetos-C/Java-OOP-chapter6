package ex3;

public class test {
	public static void main(String[] args) {
		Movable m = new MovablePoint(3, 4, 5, 6);
		System.out.println("Initial position: " + m);
		m.moveUp();
		System.out.println("After moving up: " + m);
		m.moveRight();
		System.out.println("After moving right: " + m);
	}
}
