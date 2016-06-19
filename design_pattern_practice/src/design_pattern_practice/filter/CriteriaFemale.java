package design_pattern_practice.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria {

	public List<Employee> meetCriteria(List<Employee> persons) {
		// TODO Auto-generated method stub
		List<Employee> meetPersons = new ArrayList<Employee>();
		for(Employee person : persons){
			if(person.getGender().equalsIgnoreCase("female")){
				meetPersons.add(person);
			}
		}
		return meetPersons;
	}

}
