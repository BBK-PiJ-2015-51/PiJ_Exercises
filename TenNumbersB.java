import java.util.ArrayList;
import java.util.List;

public class TenNumbersB {

	public static void main(String args[]) {
		TenNumbersB newTN = new TenNumbersB();
		newTN.launch();
	}

	public void launch() {
	
		calculateAverage(getNumbers(getAmount()));
		
	} 

	public Integer getAmount() {
		System.out.println("How many number do you want to enter?");
			Integer newInt = null;
			while (newInt == null) {
				try {
					String s = System.console().readLine();
					newInt = Integer.parseInt(s);
				} catch (NumberFormatException ex) {
					System.out.println("Not an Integer, enter again");
	 			}  
			}	
			return newInt;
	}

	public List<Integer> getNumbers(Integer i) {
		List<Integer> intList = new ArrayList<Integer>();
		System.out.println("Please enter " + i + " numbers");
			while (intList.size() < i) {
				try {
					String str = System.console().readLine();
					Integer tempInt = Integer.parseInt(str);
					intList.add(tempInt);
				} catch (NumberFormatException ex) {
						System.out.println("Not an Integer, enter again");
			 	}  
	 		}
	 	return intList;	
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