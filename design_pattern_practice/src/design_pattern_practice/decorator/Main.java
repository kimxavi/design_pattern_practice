package design_pattern_practice.decorator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer paperPrinter = new PaperPrinter();
		Printer paper3D = new Printer3D(paperPrinter);
		paper3D.print();

	}

}
