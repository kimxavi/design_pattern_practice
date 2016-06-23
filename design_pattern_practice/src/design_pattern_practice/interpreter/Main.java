package design_pattern_practice.interpreter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM table";
		Expression selectExpression = new IsInExpression("SELECT");
		Expression fromExpression = new IsInExpression("FROM");
		Expression andExpression = new AndExpression(selectExpression, fromExpression);
		System.out.println(andExpression.evaluate(sql));
		
		
	}

}
