package design_pattern_practice.composite;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee CEO = new Employee("jack","CEO");
		Employee CTO = new Employee("michael","CTO");
		Employee CMO = new Employee("mary","CMO");
		Employee marketer1 = new Employee("hoya","marketer");
		Employee marketer2 = new Employee("helman","marketer");
		Employee programmer1 = new Employee("pain","programmer");
		Employee programmer2 = new Employee("pro","programmer");
		
		CEO.add(CTO);
		CEO.add(CMO);
		CTO.add(programmer1);
		CTO.add(programmer2);
		CMO.add(marketer1);
		CMO.add(marketer2);
		
		System.out.println(CEO);

	}

}
