package design_pattern_practice.state;

public class StopState implements State {

	@Override
	public void doAction(Context context) {
		// TODO Auto-generated method stub
		context.setState(this);
		System.out.println("Stop Action");
	}

	@Override
	public String toString() {
		return "StopState ";
	}

}
