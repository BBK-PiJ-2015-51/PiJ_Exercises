
public class TestSupermarket {
	
public static void main(String[]args) {


	Supermarket s = new Supermarket();

	s.addPerson(new Person("Adam", 35) );
	s.addPerson(new Person("Bob", 26) );
	s.addPerson(new Person("Carl", 31) );

	s.printList();

	s.servePerson();
	s.printList();
	s.servePerson();
	s.servePerson();
	s.servePerson();

	s.printList();

	}

}