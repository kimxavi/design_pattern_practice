package design_pattern_practice.singleton;

public class MainWindow {
	private static MainWindow instance = new MainWindow();
	private MainWindow() {
		// TODO Auto-generated constructor stub
	}
	
	public static MainWindow getInsance() {
		return instance;
	}
	public void showMessage() {
		System.out.println("MainWindow");
	}
}
