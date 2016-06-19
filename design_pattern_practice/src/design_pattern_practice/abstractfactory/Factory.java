package design_pattern_practice.abstractfactory;

public interface Factory {
	Shape getShape(String type);
	Printer getPrinter(String type);
}
