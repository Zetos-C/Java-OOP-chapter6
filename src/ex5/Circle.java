package ex5;

public class Circle implements GeometricObject{

	protected double radius;
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	@Override
	public double getArea() {
		return radius*radius*3.14;
	}

	@Override
	public double getPerimeter() {
		return radius*2*3.14;
	}

	
}

