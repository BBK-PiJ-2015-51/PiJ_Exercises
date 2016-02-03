public class ListUtilitiesSorted {

	private IntegerNode startOfList = null;

	public void createLinkedList (int[] intArray) {

		for (int i = 0; i < intArray.length; i++) {

			IntegerNode newNode = new IntegerNode(intArray[i]);

			//first number
			if (startOfList == null) {
				startOfList = newNode;

				//if next int < start
			} else if (newNode.getInt() < startOfList.getInt()) {
						newNode.setNextIntegerNode(startOfList);
						startOfList = newNode; 
			} else	{
				
				IntegerNode temp = startOfList;
				boolean finished = false;
				
				while (temp.getNextIntegerNode() != null && !finished) {
					if (newNode.getInt() < temp.getNextIntegerNode().getInt()) {
						newNode.setNextIntegerNode(temp.getNextIntegerNode());
						temp.setNextIntegerNode(newNode);
						finished = true;
					} else {
						temp = temp.getNextIntegerNode();
					}
				}
				temp.setNextIntegerNode(newNode);
			}
		}
	}

	public void printList() {

		IntegerNode temp = startOfList;
		while (temp.getNextIntegerNode() != null) {
			System.out.println(temp.getInt());
			temp = temp.getNextIntegerNode();
		}
		System.out.println(temp.getInt());

	}

}