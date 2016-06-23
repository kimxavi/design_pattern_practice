package design_pattern_practice.mediator;

public class Main {
	public static void main(String[] args) {
		Machine m1 = new Machine("m1");
		Machine m2 = new Machine("m2");
		m1.sendMessage("Hello");
		m2.sendMessage("World!");
	}
}
