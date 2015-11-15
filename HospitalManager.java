
public class HospitalManager {

	public int total = 0;
	private Patient patientListStart = null;


	public void setPatientListStart( Patient patient) {

		this.patientListStart = patient;
	}

	public Patient getPatientListStart() {

		return this.patientListStart;

	}

	
	public void addPatient(String name, int age, String illness) {

		Patient newPatient = new Patient(name, age, illness);

		if (patientListStart == null) {

			patientListStart = newPatient;

			return;

		} 

		Patient aux = patientListStart;
		while (aux.getNextPatient() != null) {

			aux = aux.getNextPatient();
		}

		aux.setNextPatient(newPatient); 

	}

	public void deletePatient(String name) {

		if (patientListStart.getPatientName().equals(name)) {

			patientListStart = patientListStart.getNextPatient();

			return;

		}

		Patient temp = patientListStart;
		while (!temp.getNextPatientName().equals(name) ) {
		temp = temp.getNextPatient();
		}

		temp.setNextPatient(temp.getNextPatient().getNextPatient());

	}

	public void printList() {

		Patient aux = patientListStart;
		while (aux != null) {
			System.out.println(aux.getPatientName());
			aux = aux.getNextPatient();
		}

		System.out.println();

	}

	public void countPatientList() {

		int total = 0;
		Patient temp = patientListStart;
		while (temp != null) {
			total++;
			temp = temp.getNextPatient();
		}

		System.out.println(total);

	}

}