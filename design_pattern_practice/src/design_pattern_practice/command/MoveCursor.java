package design_pattern_practice.command;

public class MoveCursor implements Command {
	private MouseCursor cursor;
	
	public MoveCursor(MouseCursor cursor) {
		this.cursor = cursor;
	}

	@Override
	public void execute() {
		cursor.move();
	}

}
