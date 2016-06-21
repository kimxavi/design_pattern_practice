package design_pattern_practice.iterator;

public class NumberBag {
	private int [] numbers = {1,6,3,5,2};
	public Iterator getIterator(){
		return new NumberBagIterator();
	}
	public class NumberBagIterator implements Iterator{
		private int index = 0;
		@Override
		public boolean hasNext() {
			if(index < numbers.length)
				return true;
			return false;
		}

		@Override
		public Object next() {
			if(this.hasNext()){
				return numbers[index++];
			}
			return null;
		}
		
	}
}
