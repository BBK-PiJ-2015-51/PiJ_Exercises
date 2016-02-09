public class SmartPhone extends MobilePhone {

	public SmartPhone(String brand) {
		super(brand);
	}

	public void browseWeb(String s) {
		System.out.println("The internet is broke, try again later");
	}

	public void findPosition() {
		System.out.println("Your position is 5476.09378");
	}

	public void call(String number) {
	String code = number.substring(0,2);


		if (code.equals("00")) {
			System.out.println("Printing through the internet");
		} else {
			super.call(number);
		} 
			
	}
}