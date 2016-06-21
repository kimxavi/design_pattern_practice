package design_pattern_practice.chainofresponsibility;

public class EmailLogger extends Logger {

	@Override
	public void log(String message) {
		System.out.println("Email : " + message);
	}

}
