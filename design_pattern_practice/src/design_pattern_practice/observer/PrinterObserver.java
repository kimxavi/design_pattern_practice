package design_pattern_practice.observer;

public class PrinterObserver extends Observer {
	public PrinterObserver(MyValue subject) {
		// TODO Auto-generated constructor stub
		this.subject = subject;
		this.subject.attach(this);
	}
	@Override
	public void update() {
		System.out.println("Printer : " + subject.getState());
	}

}
