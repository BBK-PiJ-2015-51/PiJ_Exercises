
public class PatientCircular {

	private String name;
	private int age;
	private String illness;
	private PatientCircular previousPatient;
	private PatientCircular nextPatient;

	public PatientCircular(String name, int age, String illness) {

		this.name = name;
		this.age = age;
		this.illness = illness;
		this.previousPatient = null;
		this.nextPatient = null;

	}


	public void addPatient(PatientCircular patient) {

		if (this.nextPatient == null) {

			this.nextPatient = patient;

		} else {

			this.nextPatient.addPatient(patient);

		}

	}

	public boolean deletePatient(PatientCircular patient) {

		if (this.nextPatient == null) {

			return false;

		} else if (this.nextPatient.name.equals(patient.name)) {

			this.nextPatient = nextPatient.nextPatient;

			return true;

		}  else {

			return this.nextPatient.deletePatient(patient);

		}

	}


	public void printPatientList() {

			System.out.println(this.name);
			
			if (this.nextPatient != null) {
			this.nextPatient.printPatientList();
			}

	} 

	public void setNextPatient(PatientCircular patient) {

		this.nextPatient = patient;
	}

	public PatientCircular getNextPatient() {

		return nextPatient;


	}

	public PatientCircular getPreviousPatient() {

		return this.previousPatient;
	}


	public String getNextPatientName() {

		return  this.nextPatient.name;
	}

	public String getPatientName() {

		return this.name;
	}

	public void setPreviousPatient(PatientCircular patient) {

		this.previousPatient = patient;

	}
	
}