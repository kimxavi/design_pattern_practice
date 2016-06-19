package design_pattern_practice.abstractfactory;

public class PrinterFactory implements Factory {

	@Override
	public Shape getShape(String type) {
		return null;
	}

	@Override
	public Printer getPrinter(String type) {
		if(type == null){
			return null;
		}
		if(type.equalsIgnoreCase("paper")){
			return new PaperPrinter();
		}
		return null;
	}

}
