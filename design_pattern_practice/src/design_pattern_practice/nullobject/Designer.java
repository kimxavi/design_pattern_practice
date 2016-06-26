package design_pattern_practice.nullobject;

public class Designer extends AbstractEmployee {

	public Designer(String name) {
		this.name = name;
	}
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public boolean isNull() {
		return false;
	}

}
