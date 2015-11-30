public class PersonQueueImplementation implements PersonQueue {
	
	Person firstPerson = null;


	public PersonQueueImplementation() {

	}


	public void insert(Person person) {

		if (firstPerson == null) {

			firstPerson = person;

			return;
		}

		Person aux = person;

		while (aux.nextPerson != null) {

			aux = aux.getNextPerson();

		}

		aux.setNextPerson(aux);

	}

	public Person retrieve() {

		return firstPerson;

	}

}