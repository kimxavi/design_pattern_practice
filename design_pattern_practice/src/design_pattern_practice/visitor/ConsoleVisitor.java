package design_pattern_practice.visitor;

public class ConsoleVisitor implements Visitor {

	@Override
	public void visit(TreeNode n) {
		System.out.println("Console Visitor "+n.getName());
	}

}
