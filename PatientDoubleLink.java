
public class PatientDoubleLink {

	private String name;
	private int age;
	private String illness;
	private PatientDoubleLink previousPatient;
	private PatientDoubleLink nextPatient;

	public PatientDoubleLink(String name, int age, String illness) {

		this.name = name;
		this.age = age;
		this.illness = illness;
		this.previousPatient = null;
		this.nextPatient = null;

	}


	public void addPatient(PatientDoubleLink patient) {

		if (this.nextPatient == null) {

			this.nextPatient = patient;

		} else {

			this.nextPatient.addPatient(patient);

		}

	}

	public boolean deletePatient(PatientDoubleLink patient) {

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

	public void setNextPatient(PatientDoubleLink patient) {

		this.nextPatient = patient;
	}

	public PatientDoubleLink getNextPatient() {

		return nextPatient;


	}

	public PatientDoubleLink getPreviousPatient() {

		return this.previousPatient;
	}


	public String getNextPatientName() {

		return  this.nextPatient.name;
	}

	public String getPatientName() {

		return this.name;
	}

	public void setPreviousPatient(PatientDoubleLink patient) {

		this.previousPatient = patient;

	}
	
}