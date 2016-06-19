package design_pattern_practice.proxy;

public class ConsolePrinter implements Printer {

	private String filename;
	
	public ConsolePrinter(String filename) {
		this.filename = filename;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("ConsolePrinter " + filename);

	}

}
