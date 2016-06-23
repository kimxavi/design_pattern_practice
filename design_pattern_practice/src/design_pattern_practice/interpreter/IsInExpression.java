package design_pattern_practice.interpreter;

public class IsInExpression implements Expression{
	private String data;
	
	public IsInExpression(String data) {
		super();
		this.data = data;
	}

	@Override
	public boolean evaluate(String context) {		
		return context.contains(data);
	}

}
