package design_pattern_practice.prototype;

import java.util.Hashtable;

public class ShapePrototype {
	
	private static Hashtable<String, Shape> shapeMap = new Hashtable<String,Shape>();
	
	public static Shape getShape(String id) {
		Shape shape = shapeMap.get(id);
		return (Shape) shape.clone();
	}
	public static void loadCache(){
		Rectangle rectangle = new Rectangle();
		rectangle.setId("1");
		shapeMap.put(rectangle.getId(), rectangle);
	
	}
}
