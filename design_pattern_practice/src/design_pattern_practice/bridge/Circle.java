package design_pattern_practice.bridge;

public class Circle extends Shape {
	private int x;
	private int y;
	private int radius;
	
	public Circle(int radius, int x, int y, Printer p) {
		// TODO Auto-generated constructor stub
		super(p);
		this.x = x;
		this.y = y;
		this.radius = radius;
		
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		printer.print(radius, x, y);
	}

}
