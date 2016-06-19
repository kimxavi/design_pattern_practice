package design_pattern_practice.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaRetire implements Criteria {

	@Override
	public List<Employee> meetCriteria(List<Employee> persons) {
		List<Employee> meetPersons = new ArrayList<Employee>();
		for(Employee person : persons){
			if(person.getRetireStatus().equalsIgnoreCase("yes")){
				meetPersons.add(person);
			}
		}
		return meetPersons;
	}

}
