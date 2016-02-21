
import java.util.List;
import java.util.ArrayList;

public class MorePatients {
	
	public static void main(String args[]) {
		MorePatients newMP = new MorePatients();
		newMP.launch();
	}

	public MorePatients() {

	}

	public void launch() {

		List<Patient2> patient2List = new ArrayList<Patient2>();
		boolean finished = false;

		do	{
			
			System.out.println("Add another Patient Y or N?");
			String addAnother = System.console().readLine();
			if (addAnother.equals("N")) {
				finished = true;
			} else {
				System.out.println("What is the patients name");
				String name = System.console().readLine();
				System.out.println("What is the patients age");
				String year = System.console().readLine();
				Integer yob = Integer.parseInt(year);
				Patient2 newP = new Patient2(name, yob);
				patient2List.add(newP);
			}
		} while (!finished);

		System.out.println(patient2List.size());

	}

}