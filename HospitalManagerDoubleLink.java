
public class HospitalManagerDoubleLink {

	public int total = 0;
	private PatientDoubleLink patientListStart = null;


	public void setPatientListStart( PatientDoubleLink patient) {

		this.patientListStart = patient;
	}

	public PatientDoubleLink getPatientListStart() {

		return this.patientListStart;

	}

	
	public void addPatient(String name, int age, String illness) {

		PatientDoubleLink newPatient = new PatientDoubleLink(name, age, illness);

		if (patientListStart == null) {

			patientListStart = newPatient;

			return;

		} 

		PatientDoubleLink aux = patientListStart;
		while (aux.getNextPatient() != null) {

			aux = aux.getNextPatient();
		}

		aux.setNextPatient(newPatient); 
		aux.getNextPatient().setPreviousPatient(aux);

	}

	public void deletePatient(String name) {

		if (patientListStart.getPatientName().equals(name)) {

			patientListStart = patientListStart.getNextPatient();

			patientListStart.setPreviousPatient(null) ;

			return;

		}

		PatientDoubleLink temp = patientListStart;
		while (!temp.getNextPatientName().equals(name) && temp.getNextPatient().getNextPatient() != null) {

			temp = temp.getNextPatient();
			}

		if (temp.getNextPatient().getNextPatient() == null) {

			temp.setNextPatient(null);

		} else {

			temp.getNextPatient().getNextPatient().setPreviousPatient(temp);

			temp.setNextPatient(temp.getNextPatient().getNextPatient());

		}
		
		
	}

	public void printList() {

		PatientDoubleLink aux = patientListStart;
		while (aux != null) {
			System.out.println(aux.getPatientName());
			aux = aux.getNextPatient();
		}

		System.out.println();

	}

	public void printListBackwards() {

		PatientDoubleLink aux = patientListStart;
		while (aux.getNextPatient() != null) {
			aux = aux.getNextPatient();
		}

		while (aux != null) {
			System.out.println(aux.getPatientName());
			aux = aux.getPreviousPatient();
		}

		System.out.println();

	}

	public void countPatientList() {

		int total = 0;
		PatientDoubleLink temp = patientListStart;
		while (temp != null) {
			total++;
			temp = temp.getNextPatient();
		}

		System.out.println(total);

	}

}