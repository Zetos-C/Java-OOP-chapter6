package ex1;

public class Square extends Rectangle {
	private double side;

	public Square() {
		super();
	}

	public Square(double side) {
		super(side, side);
		this.side = side;
	}

	public Square(double side, String color, Boolean filled) {
		super(side, side, color, filled);
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public String toString() {
		return "Square[" + super.toString() + "]";
	}

}
