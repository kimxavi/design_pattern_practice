package design_pattern_practice.command;

public class Main {

	public static void main(String[] args) {
		MouseCursor cursor = new MouseCursor();
		MoveCursor moveCursor = new MoveCursor(cursor);
		ResetCursor resetCursor = new ResetCursor(cursor);
		
		MouseCommands command = new MouseCommands();
		command.takeCommand(moveCursor);
		command.takeCommand(resetCursor);
		command.placeOrder();

	}

}
