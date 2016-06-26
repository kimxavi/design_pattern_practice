package design_pattern_practice.nullobject;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractEmployee employee1 = EmployeeFactory.getEmployee("zidane");
		AbstractEmployee employee2 = EmployeeFactory.getEmployee("kim");
		AbstractEmployee employee3 = EmployeeFactory.getEmployee("torres");
		AbstractEmployee employee4 = EmployeeFactory.getEmployee("lee");
		
		System.out.println(employee1.getName());
		System.out.println(employee2.getName());
		System.out.println(employee3.getName());
		System.out.println(employee4.getName());
		
	}

}
