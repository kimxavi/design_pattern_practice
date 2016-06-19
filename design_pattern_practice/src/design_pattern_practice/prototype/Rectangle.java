package design_pattern_practice.prototype;

public class Rectangle extends Shape {

	public Rectangle() {
		// TODO Auto-generated constructor stub
		type = "rectangle";
	}
	@Override
	void draw() {
		System.out.println("Rectangle");
	}

}
