package ex2;

public class Circle implements GeometricObject{

	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return radius*radius*Math.PI;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return radius*2*Math.PI;
	}

	
}
