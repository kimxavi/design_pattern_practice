package design_pattern_practice.factory;

public class ShapeFactory {
	static public Shape getShape(String type){
		if(type == null){
			return null;
		}
		if(type.equalsIgnoreCase("rectangle")){
			return new Rectangle();
		}else if(type.equalsIgnoreCase("circle")){
			return new Circle();
		}
		return null;
	}
}
