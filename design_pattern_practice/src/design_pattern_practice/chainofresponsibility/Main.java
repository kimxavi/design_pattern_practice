package design_pattern_practice.chainofresponsibility;

public class Main {

	public static void main(String[] args) {
		Logger consoleLogger = new ConsoleLogger();
		Logger emailLogger	 = new EmailLogger();
		emailLogger.setNextLogger(consoleLogger);
		
		emailLogger.logMessage("Hello World!");

	}

}
