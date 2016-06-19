package design_pattern_practice.abstractfactory;

public class ShapeFactory implements Factory {

	@Override
	public Shape getShape(String type) {
		if(type == null){
			return null;
		}
		if(type.equalsIgnoreCase("rectangle")){
			return new Rectangle();
		}
		return null;
	}

	@Override
	public Printer getPrinter(String type) {
		return null;
	}

}
