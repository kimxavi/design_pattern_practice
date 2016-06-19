package design_pattern_practice.prototype;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapePrototype.loadCache();
		Shape shape = ShapePrototype.getShape("1");
		shape.draw();
	}

}
