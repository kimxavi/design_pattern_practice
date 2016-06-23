package design_pattern_practice.mediator;

public class Machine {
	private String name;

	public Machine(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void sendMessage(String message){
		Printer.showMessage(this, message);
	}
}
