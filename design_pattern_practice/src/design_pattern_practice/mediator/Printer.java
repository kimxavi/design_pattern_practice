package design_pattern_practice.mediator;

public class Printer {
	public static void showMessage(Machine machine, String message){
		System.out.println(new java.util.Date().toString()+","+machine.getName()+","+message);
		
	}
}
