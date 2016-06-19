package design_pattern_practice.filter;

import java.util.List;

public interface Criteria {
	public List<Employee> meetCriteria(List<Employee> persons);
}
