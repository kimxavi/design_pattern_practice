package design_pattern_practice.decorator;

public class Printer3D extends PrinterDecorator {

	public Printer3D(Printer p) {
		super(p);
	}
	@Override
	public void print() {
		System.out.println("3D");
		decoratedPrinter.print();
	}

}
