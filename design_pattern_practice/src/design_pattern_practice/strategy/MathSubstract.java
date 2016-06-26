package design_pattern_practice.strategy;

public class MathSubstract implements Algorithm {

	@Override
	public int calculate(int num1, int num2) {
		return num1 - num2;
	}

}
