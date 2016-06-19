package design_pattern_practice.bridge;

abstract class Shape {
	protected Printer printer;
	protected Shape(Printer p) {
		// TODO Auto-generated constructor stub
		this.printer = p;
	}
	public abstract void draw();
	
}
