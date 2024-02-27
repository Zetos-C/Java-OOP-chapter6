package ex5;

public class ResizeableCircle extends Circle implements Resizable {

	public ResizeableCircle(double radius) {
		super(radius);
	}

	@Override
	public String toString() {
		return "ResizeableCircle [" + super.toString() + "]";
	}

	@Override
	public void resize(int percent) {
		super.radius *= percent / 100.0;
	}

}
