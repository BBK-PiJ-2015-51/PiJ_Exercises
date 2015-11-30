public class Person {

	private String name;
	private int age;
	Person nextPerson;


	Person(String name, int age) {

		this.name = name;
		this.age = age;
		this.nextPerson = null;
	}


	public Person getNextPerson() {
		return nextPerson;
	}

	public void setNextPerson(Person person) {
		this.nextPerson = person;
	}

	public String getPersonName() {

		return this.name;
	}

}