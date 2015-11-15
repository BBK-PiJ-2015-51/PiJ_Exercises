
public class TestHospitalManagerDoubleLink {
	
	public static void main(String[]args) {

		HospitalManagerDoubleLink hm = new HospitalManagerDoubleLink();

		hm.addPatient("adam", 34, "badhead");
		
		hm.addPatient("brian",23,"badleg");

		hm.addPatient("carl",23,"badleg");

		hm.addPatient("david",23,"badleg");

		hm.addPatient("edward",23,"badleg");

		hm.addPatient("fabio",23,"badleg");

		System.out.println("forward");
		hm.printList();

		System.out.println("backward");
		hm.printListBackwards();

		hm.deletePatient("fabio");

		System.out.println("forward");
		hm.printList();

		System.out.println("backward");
		hm.printListBackwards();

	

	}

}