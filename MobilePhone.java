import java.util.Random;
import java.util.Scanner;

public class MobilePhone extends OldPhone {

	public MobilePhone(String brand) {
		super(brand);
	}

	public void ringAlarm(String s) {
		System.out.println("Alarm ringing....");
		if ( s.equals("Wake Up!")) {
			System.out.println("Beep! Beep! Beep!!!!!");
		} else if (s.equals("Reminder!")) {
			System.out.println("Swoopoosh!");
			}
	}
	
	public void playGame(String s) {

		Random random = new Random();
		int randomNumber =  random.nextInt(10);
		boolean finished = false;
		int guesses = 0;

		while(finished == false) {
			System.out.println("Guess the number");
			Scanner reader = new Scanner(System.in);  // Reading from System.in
			int n = reader.nextInt(); 
			if (n == randomNumber) {
				System.out.println("You guessed correct, See you later!!");
				finished = true;
			} else if (guesses == 5) {
				System.out.println("Sorry you have run out of guesses!!") ;
			} else {
				guesses++;
			}
		}
	}

	

	public void printLastNumbers() {
		System.out.println("these are the last 10 numbers");
		for(int i = 0; i < phoneHistory.length; i++) {
			System.out.println(i + ": " + phoneHistory[i]);
		}
	}

}



