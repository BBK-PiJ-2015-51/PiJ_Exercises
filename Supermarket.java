public class Supermarket {
	
	private PersonQueueImplementation queue;

	public Supermarket() {

	}


	addPerson(Person person) {

		if (queue == null) {

			queue = new PersonQueueImplementation();

			
		}
queue.insert(person);
	}


	servePerson() {

	}

	public void printList() {

		System.out.println("will print out later...");

	}

}