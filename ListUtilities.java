public class ListUtilities {

	private IntegerNode startOfList = null;

	public void createLinkedList (int[] intArray) {

		for (int i = 0; i < intArray.length; i++) {

			IntegerNode newNode = new IntegerNode(intArray[i]);
			if (startOfList == null) {
				startOfList = newNode;
			} else	{
				IntegerNode temp = startOfList;
				while (temp.getNextIntegerNode() != null) {
					temp = temp.getNextIntegerNode();
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