package design_pattern_practice.observer;

public abstract class Observer {
	protected MyValue subject;
	public abstract void update();
}
