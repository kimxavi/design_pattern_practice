package design_pattern_practice.filter;

import java.util.List;

public class AndCriteria implements Criteria {
	private Criteria criteria1;
	private Criteria criteria2;
	
	public AndCriteria(Criteria criteria1, Criteria criteria2) {
		this.criteria1 = criteria1;
		this.criteria2 = criteria2;
	}

	@Override
	public List<Employee> meetCriteria(List<Employee> persons) {
		List<Employee> t = criteria1.meetCriteria(persons);
		List<Employee> meet = criteria2.meetCriteria(t);
		return meet;
	}
}
