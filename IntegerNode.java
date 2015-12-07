public class IntegerNode {
	
	private int num = 0;
	private IntegerNode nextIntegerNode = null;


	public IntegerNode(int num) {
		this.num = num;
	}

	public int getInt() {
		return this.num;
	}

	public IntegerNode getNextIntegerNode() {
		return this.nextIntegerNode;
	}

	public void setNextIntegerNode(IntegerNode i) {
		this.nextIntegerNode = i;
	} 

}