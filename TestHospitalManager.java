
public class TestHospitalManager {
	
	public static void main(String[]args) {

		HospitalManager hm = new HospitalManager();

		hm.addPatient("adam", 34, "badhead");
		
		hm.addPatient("brian",23,"badleg");

		hm.addPatient("carl",23,"badleg");

		hm.addPatient("david",23,"badleg");

		hm.addPatient("edward",23,"badleg");

		hm.addPatient("fabio",23,"badleg");

		hm.printList();

		hm.countPatientList();

		hm.deletePatient("adam");

		hm.printList();

		hm.countPatientList();

	}

}