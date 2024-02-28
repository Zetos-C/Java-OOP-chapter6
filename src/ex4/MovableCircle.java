package ex4;

public class MovableCircle implements Movable {
	private int radius;
	private MovablePoint center;

	public MovableCircle() {
	}

	public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
		this.radius = radius;
		this.center = new MovablePoint(x, y, xSpeed, ySpeed);
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public MovablePoint getCenter() {
		return center;
	}

	public void setCenter(MovablePoint center) {
		this.center = center;
	}

	@Override
	public String toString() {
		return center + ",radius=" + radius;
	}

	@Override
	public void moveUp() {
		this.center.y -= this.center.ySpeed;
	}

	@Override
	public void moveDown() {
		this.center.y += this.center.ySpeed;
	}

	@Override
	public void moveLeft() {
		this.center.x -= this.center.xSpeed;
	}

	@Override
	public void moveRight() {
		this.center.x += this.center.xSpeed;
	}
}
