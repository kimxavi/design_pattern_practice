package design_pattern_practice.filter;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Employee> persons = new ArrayList<Employee>();
		
		persons.add(new Employee("jack", "male", "NO"));
		persons.add(new Employee("michael", "male", "yes"));
		persons.add(new Employee("mary","female", "yes"));
		persons.add(new Employee("hoya","female", "no"));
		
		Criteria criteriaFemale = new CriteriaFemale();
		List<Employee> femaleList = criteriaFemale.meetCriteria(persons);
		System.out.println("femaleList : " +femaleList);
		
		Criteria criteriaRetire = new CriteriaRetire();
		List<Employee> retireList = criteriaRetire.meetCriteria(persons);
		System.out.println("retireList : " +retireList);
		
		Criteria femaleRetireCriteria = new AndCriteria(criteriaFemale,criteriaRetire);
		List<Employee> femaleRetireList = femaleRetireCriteria.meetCriteria(persons);
		System.out.println("female and retire : "+ femaleRetireList);

		Criteria orCriteria = new OrCriteria(criteriaFemale,criteriaRetire);
		List<Employee> orList = orCriteria.meetCriteria(persons);
		System.out.println("female or retire : "+ orList);
		
	}

}
