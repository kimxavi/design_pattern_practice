package design_pattern_practice.bridge;

public class ColorPrinter implements Printer {

	@Override
	public void print(int radius, int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Color " + radius + " " + x + " " + y);
	}

	

}
