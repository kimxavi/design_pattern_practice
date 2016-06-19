package design_pattern_practice.decorator;

public abstract class PrinterDecorator implements Printer {
	protected Printer decoratedPrinter;
	
	public PrinterDecorator(Printer decoratedPrinter) {
		this.decoratedPrinter = decoratedPrinter;
	}
}
