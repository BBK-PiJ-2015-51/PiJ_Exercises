public class TestListUtilitiesSorted {
	
public static void main(String[]args) {

	int[] newIntArray = new int[5];
	
	newIntArray[0] = 3;
	newIntArray[1] = 8;
	newIntArray[2] = 1;
	newIntArray[3] = 6;
	newIntArray[4] = 9;

	ListUtilitiesSorted newList = new ListUtilitiesSorted();

	int[] newIntArray2 = new int[] {3,9, 4,2,1,8,6,7,7};

	newList.createLinkedList(newIntArray2);

	newList.printList();




}

	


}