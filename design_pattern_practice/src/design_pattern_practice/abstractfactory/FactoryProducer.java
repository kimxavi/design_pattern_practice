package design_pattern_practice.abstractfactory;

public class FactoryProducer {
	static public Factory getFactory(String type) {
		// TODO Auto-generated method stub
		if(type == null){
			return null;
		}
		if(type.equalsIgnoreCase("shape")){
			return new ShapeFactory();
		}else if(type.equalsIgnoreCase("printer")){
			return new PrinterFactory();
		}
		return null;
	}
}
