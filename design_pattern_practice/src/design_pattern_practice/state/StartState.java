package design_pattern_practice.state;

public class StartState implements State {

	@Override
	public void doAction(Context context) {
		// TODO Auto-generated method stub
		System.out.println("Start Action");
		context.setState(this);
	}

	@Override
	public String toString() {
		return "StartState";
	}
	
}
