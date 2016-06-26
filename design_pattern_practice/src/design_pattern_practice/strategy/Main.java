package design_pattern_practice.strategy;

public class Main {

	public static void main(String[] args) {
		
		MathContext context = new MathContext(new MathAdd());
		int num1 = 10;
		int num2 = 5;
		
		System.out.println(context.execute(num1, num2));
		
		context = new MathContext(new MathSubstract());
		System.out.println(context.execute(num1, num2));

	}

}
