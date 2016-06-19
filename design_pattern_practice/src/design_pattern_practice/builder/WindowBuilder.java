package design_pattern_practice.builder;

public class WindowBuilder {

	public static MainWindow createWindow(){
		MainWindow window = new MainWindow();
		Menu menu = new Menu();
		ToolBar toolbar = new ToolBar();
		window.setMenu(menu);
		window.setToolbar(toolbar);
		return window;
	}
}
