package ex2;

public class Circle implements GeometricObject{

	private double radius;
	
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
		// TODO Auto-generated method stub
		return radius*radius*3.14;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return radius*2*3.14;
	}

	
}
