
public class MarkReader {

	private int distinction = 0;
	private int pass = 0;
	private int fail = 0;
	private int invalid = 0;
	private int total = 0;

	public void calculateMarks() {

		Integer markInt;
		
		do {

		System.out.print("Input a mark: ");
		String markInput = System.console().readLine();
		markInt = Integer.parseInt(markInput);
		

			if (markInt == -1) {

			} else if (markInt < 0 || markInt >100) {

				invalid++;
				total++;
			
			} else if (markInt >= 70) {

				distinction++;
				total++;

			} else if (markInt >= 50 ) {

				pass++;
				total++;

			} else {

				fail++;
				total++;
			}

		} while(markInt != -1);

		System.out.print("There are " + total + " Students: " +
			distinction + " distinctions, " + pass + " pass, " + fail + " fails (plus " + 
				invalid + " invalid marks!)");


	}

}