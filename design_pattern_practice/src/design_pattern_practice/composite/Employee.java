package design_pattern_practice.composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private String title;
	private List<Employee> sub;
	
	public Employee(String name, String title) {
		this.name = name;
		this.title = title;
		sub = new ArrayList<Employee>();
	}
	
	public void add(Employee e){
		sub.add(e);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<Employee> getSub() {
		return sub;
	}
	public void setSub(List<Employee> sub) {
		this.sub = sub;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", title=" + title + ", sub=" + sub + "]";
	}
	
	

}
