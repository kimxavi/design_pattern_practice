package design_pattern_practice.command;

public class MouseCursor {
	private int x = 10;
	private int y = 10;
	
	void move(){
		System.out.println("Before "+ x + " "+y);
		x++;y++;
		System.out.println("After  "+ x + " "+y);
	}
	void reset(){
		x=10;y=10;
		System.out.println("reset");
	}

}
