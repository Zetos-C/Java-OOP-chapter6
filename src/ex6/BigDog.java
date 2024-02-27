package ex6;

public class BigDog extends Dog {

	public BigDog(String name) {
		super(name);
	}
	
	
	@Override
	public void greets() {
		super.greets();
	}


	@Override
	public void greets(Dog another) {
		super.greets(another);
	}


	public void greets(BigDog another) {
		System.out.println("Wooooooooow");
	}
}
