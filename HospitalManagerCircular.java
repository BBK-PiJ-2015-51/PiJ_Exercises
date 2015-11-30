
public class HospitalManagerCircular {

	public int total = 0;
	private PatientCircular patientListStart = null;


	public void setPatientListStart( PatientCircular patient) {

		this.patientListStart = patient;
	}

	public PatientCircular getPatientListStart() {

		return this.patientListStart;

	}

	
	public void addPatient(String name, int age, String illness) {

		PatientCircular newPatient = new PatientCircular(name, age, illness);

//first in the list
		if (patientListStart == null) {

			patientListStart = newPatient;

			return;

		} 

		PatientCircular aux = patientListStart;
		while (aux.getNextPatient() != null && !aux.getNextPatient().equals(patientListStart) ) {

			aux = aux.getNextPatient();
		}

		aux.setNextPatient(newPatient); 
		patientListStart.setPreviousPatient(newPatient);
		aux.getNextPatient().setPreviousPatient(aux);
		aux.getNextPatient().setNextPatient(patientListStart);

	}

	public void deletePatient(String name) {

		if (patientListStart.getPatientName().equals(name)) {

			PatientCircular temp = patientListStart;

			PatientCircular oldStart = patientListStart;

			patientListStart = patientListStart.getNextPatient();

				while(!temp.getNextPatient().equals(oldStart)) {

					temp = temp.getNextPatient();
				}

			temp.setNextPatient(patientListStart);

			patientListStart.setPreviousPatient(temp) ;

			return;

		}

//start back again here...

		PatientCircular temp = patientListStart;
		while (!temp.getNextPatientName().equals(name) ) {
			temp = temp.getNextPatient();
			}

			//last on list
		if (temp.getNextPatient().getNextPatient().equals(patientListStart)) {

			temp.setNextPatient(patientListStart);
			patientListStart.setPreviousPatient(temp);


		} else {

			temp.getNextPatient().getNextPatient().setPreviousPatient(temp);

			temp.setNextPatient(temp.getNextPatient().getNextPatient());

		}
		
		
	}

	public void printList() {

		PatientCircular aux = patientListStart;
		while (!aux.getNextPatient().equals(patientListStart)) {
			System.out.println(aux.getPatientName());
			aux = aux.getNextPatient();
		}
		
		System.out.println(aux.getPatientName());
		System.out.println();

	}

	

}