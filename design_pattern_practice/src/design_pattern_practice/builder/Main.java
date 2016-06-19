package design_pattern_practice.builder;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainWindow window = WindowBuilder.createWindow();
		window.showMessage();
		Menu menu = window.getMenu();
		menu.draw();
		ToolBar toolbar = window.getToolbar();
		toolbar.draw();
		
	}

}
