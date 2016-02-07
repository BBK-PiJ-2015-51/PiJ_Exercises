public class Supermarket {
	
	private PersonQueue queue;
	
	public Supermarket() {
		queue = null;
	}


	public void addPerson(Person person) {
		if (queue == null) {
			queue = new PersonQueueImplementation();
		}
		queue.insert(person);
	}


	public String servePerson() {
		if (queue.isEmpty()) {
			return "nobody in the queue";
		} else {
		String result = queue.retrieve().getPersonName();
		return result;
		}

	}

	

}