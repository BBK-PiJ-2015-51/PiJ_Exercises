public class PersonQueueImplementation implements PersonQueue {
	
	public Person firstPerson;


	public PersonQueueImplementation() {
		firstPerson = null;
	}


	public void insert(Person person) {
		if (firstPerson != null) {
		person.setNextPerson(firstPerson);
	  	}
	  	firstPerson = person;	 
	}

	public Person retrieve() {
	  if (firstPerson == null) {
		return null;
	  }
	  Person result = firstPerson;
	  firstPerson = firstPerson.getNextPerson();
	  return result;

	}

	public boolean isEmpty() {
		if (firstPerson == null) {
			return true;
		} else {
			return false;
		}

	}

}
