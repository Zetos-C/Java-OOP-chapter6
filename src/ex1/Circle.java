package ex1;

public class Circle extends Shape {
	protected double radius = 1.0;

	public Circle() {

	}

	public Circle(double radius,String color, Boolean filled) {
		super(color, filled);
		this.radius = radius;
	}

	public Circle(String color) {
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return radius*radius*3.14;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return radius*2*3.14;
	}

	@Override
	public String toString() {
		return "Circle [" + super.toString() + ", radius=" + radius + "]";
	}

}
