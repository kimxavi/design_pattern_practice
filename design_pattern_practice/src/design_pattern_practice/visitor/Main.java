package design_pattern_practice.visitor;

public class Main {

	public static void main(String[] args) {
		TreeNode treeNode = new TreeNode("GITHUB");
		treeNode.accept(new ConsoleVisitor());
	}

}
