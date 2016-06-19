package design_pattern_practice.factory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape s = ShapeFactory.getShape("circle");
		s.draw();
		
	}

}
