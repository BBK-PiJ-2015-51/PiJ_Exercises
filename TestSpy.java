public class TestSpy {
	
	public static void main(String[] args) { 

		Spy one = new Spy(111);
		Spy two = new Spy(222);
		Spy three = new Spy(333);

		two.die();

}

}