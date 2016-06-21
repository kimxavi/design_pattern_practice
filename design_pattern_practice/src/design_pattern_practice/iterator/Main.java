package design_pattern_practice.iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberBag bag = new NumberBag();
		Iterator iter = bag.getIterator();
		while(iter.hasNext()){
			int element = (int) iter.next();
			System.out.println(element);
		}
	}

}
