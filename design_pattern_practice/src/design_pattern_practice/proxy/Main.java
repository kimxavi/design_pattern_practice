package design_pattern_practice.proxy;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer proxy = new ProxyPrinter("test");
		proxy.print();
	}

}
