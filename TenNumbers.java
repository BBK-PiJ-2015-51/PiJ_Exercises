import java.util.ArrayList;
import java.util.List;

public class TenNumbers {

	public static void main(String args[]) {
		TenNumbers newTN = new TenNumbers();
		newTN.launch();
	}

	public void launch() {
		List<Integer> intList = new ArrayList<Integer>();
		System.out.println("Please enter 10 numbers");
		while (intList.size() < 3) {
			try {
				String str = System.console().readLine();
				Integer tempInt = Integer.parseInt(str);
				intList.add(tempInt);
			} catch (NumberFormatException ex) {
				System.out.println("Not an Integer, enter again");
	 		}  
	 	}
		calculateAverage(intList);
	}

	public void calculateAverage(List<Integer> l) {
		Integer total = 0;
		for(int i = 0; i<l.size(); i++) {
			total = total + l.get(i);
		}
		Integer avg = total/l.size();
		System.out.println("The average is " + avg);
	}
}