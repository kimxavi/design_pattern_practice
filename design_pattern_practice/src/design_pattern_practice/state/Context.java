package design_pattern_practice.state;

public class Context {
	public State state;

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
}
