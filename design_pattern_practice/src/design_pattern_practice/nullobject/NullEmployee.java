package design_pattern_practice.nullobject;

public class NullEmployee extends AbstractEmployee {

	@Override
	public String getName() {
		return "this is not available";
	}

	@Override
	public boolean isNull() {
		return true;
	}

}
