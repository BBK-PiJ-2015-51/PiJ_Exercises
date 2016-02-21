
public class Patient2 {

	String name = null;
	Integer yob = null;

	public Patient2(String name, Integer yob) {
		
		if (yob < 0 || yob > 130) {
			throw new InvalidAgeException();
		} else {
			this.name = name;
			this.yob = yob;
		}
		
	}

}