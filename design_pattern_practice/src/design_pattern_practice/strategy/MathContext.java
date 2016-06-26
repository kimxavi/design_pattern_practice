package design_pattern_practice.strategy;

public class MathContext {
	private Algorithm algorithm;
	
	
	public MathContext(Algorithm algorithm) {
		this.algorithm = algorithm;
	}


	public int execute(int num1, int num2){
		return algorithm.calculate(num1, num2);
	}
}
