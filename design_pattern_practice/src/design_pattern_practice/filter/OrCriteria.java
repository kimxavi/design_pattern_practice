package design_pattern_practice.filter;

import java.util.List;

public class OrCriteria implements Criteria {
	private Criteria criteria1;
	private Criteria criteria2;
	
	public OrCriteria(Criteria criteria1, Criteria criteria2) {
		this.criteria1 = criteria1;
		this.criteria2 = criteria2;
	}


	@Override
	public List<Employee> meetCriteria(List<Employee> persons) {
		
		List<Employee> first	= criteria1.meetCriteria(persons);
		List<Employee> second	= criteria2.meetCriteria(persons);
		for(Employee e : first){
			if(!second.contains(e)){
				second.add(e);
			}
		}
		
		return second;
	}

}
