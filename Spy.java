

public class Spy {
	
	private static int spyCount = 0;
	private int spyId;

	public Spy(int spyId) {

		this.spyId = spyId;
		spyCount++;
		System.out.println(spyId);
		System.out.println("Spy Count is now " + spyCount);
		

	}

	public void die() {

		System.out.println("Spy " + spyId + " has been detected and eliminated");
		spyCount--;
		System.out.println("Spy Count is now " + spyCount);
	}

}