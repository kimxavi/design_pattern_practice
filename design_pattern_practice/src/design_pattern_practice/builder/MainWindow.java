package design_pattern_practice.builder;

public class MainWindow {
	private Menu menu;
	private ToolBar toolbar;
	public Menu getMenu() {
		return menu;
	}
	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	public ToolBar getToolbar() {
		return toolbar;
	}
	public void setToolbar(ToolBar toolbar) {
		this.toolbar = toolbar;
	}
	
	public void showMessage() {
		// TODO Auto-generated method stub
		System.out.println("MainWindow");
	}
}
