package ex1;

public class Rectangle extends Shape {
	protected double width = 1.0;
	protected double length = 1.0;

	public Rectangle() {
		super();
	}

	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}

	public Rectangle(double width, double length,String color, Boolean filled) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width*length;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return (width+length)*2;
	}

	@Override
	public String toString() {
		return "Rectangle [color=" + color + ", filled=" + filled + ", width=" + width + ", length=" + length + "]";
	}

}
