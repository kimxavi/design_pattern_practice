package design_pattern_practice.chainofresponsibility;

public class ConsoleLogger extends Logger {

	@Override
	public void log(String message) {
		System.out.println("Console : " + message);
	}

}
