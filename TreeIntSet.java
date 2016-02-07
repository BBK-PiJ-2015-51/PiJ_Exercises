public class TreeIntSet implements IntSet {

	IntegerTreeNode t;

	public TreeIntSet(int i) {
		t = new IntegerTreeNode(i);
	}

	public void add(int i) {
		t.add(i);
	}

	public boolean contains(int i) {
		return t.contains(i);
	}

	public boolean containsVerbose(int i) {
		return t.contains(i);
		//t.toString();
	}

	public String toString() {
		return t.toString();
	}



}
