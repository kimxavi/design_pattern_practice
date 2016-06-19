package design_pattern_practice.bridge;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle(100,10,50, new ColorPrinter());
		circle.draw();
	}

}
