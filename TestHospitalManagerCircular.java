
public class TestHospitalManagerCircular {
	
	public static void main(String[]args) {

		HospitalManagerCircular hm = new HospitalManagerCircular();

		hm.addPatient("adam", 34, "badhead");
		
		hm.addPatient("brian",23,"badleg");

		hm.addPatient("carl",23,"badleg");

		hm.addPatient("david",23,"badleg");

		hm.addPatient("edward",23,"badleg");

		hm.addPatient("fabio",23,"badleg");

		
		hm.printList();

		hm.deletePatient("carl");
		hm.deletePatient("david");

		hm.printList();
	

	}

}