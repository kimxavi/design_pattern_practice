package design_pattern_practice.abstractfactory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory shapeFactory = FactoryProducer.getFactory("shape");
		Shape rect = shapeFactory.getShape("Rectangle");
		rect.draw();
		
		Factory printerFactory = FactoryProducer.getFactory("printer");
		Printer paper = printerFactory.getPrinter("paper");
		paper.print();
	}

}
