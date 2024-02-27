package ex3;

public class test {
	public static void main(String[] args) {
		Movable m = new MovablePoint(3, 4, 5, 6);
		m.moveUp();
		m.moveRight();
		System.out.println(m);
	}
}
