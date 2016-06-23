package design_pattern_practice.observer;

public class Main {
	public static void main(String[] args) {
		MyValue myValue = new MyValue();
		
		new FileObserver(myValue);
		new PrinterObserver(myValue);
		
		myValue.setState(10);
		
		myValue.setState(20);
	}
}
