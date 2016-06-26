package design_pattern_practice.visitor;

public class TreeNode {
	private String name;

	public TreeNode(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void accept(Visitor v){
		v.visit(this);
	}
	
}
