package design_pattern_practice.command;

public class ResetCursor implements Command {
	private MouseCursor cursor;

	public ResetCursor(MouseCursor cursor) {
		this.cursor = cursor;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		cursor.reset();
	}

}
