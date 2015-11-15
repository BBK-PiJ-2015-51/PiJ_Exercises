
public class Patient {

	private String name;
	private int age;
	private String illness;
	private Patient nextPatient;

	public Patient(String name, int age, String illness) {

		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null;
	}


	public void addPatient(Patient patient) {

		if (this.nextPatient == null) {

			this.nextPatient = patient;

		} else {

			this.nextPatient.addPatient(patient);

		}

	}

	public boolean deletePatient(Patient patient) {

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

	public void setNextPatient(Patient patient) {

		this.nextPatient = patient;
	}

	public Patient getNextPatient() {

		return nextPatient;


	}

	public String getNextPatientName() {

		return  this.nextPatient.name;
	}

	public String getPatientName() {

		return this.name;
	}

	
}