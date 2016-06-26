package design_pattern_practice.nullobject;

public class EmployeeFactory {
	private static String [] employeeList = {"kim", "lee", "park"};
	
	public static AbstractEmployee getEmployee(String name){
		for(String e : employeeList){
			if(e.equalsIgnoreCase(name)){
				return new Designer(e);
			}
		}
		return new NullEmployee();
	}
}
