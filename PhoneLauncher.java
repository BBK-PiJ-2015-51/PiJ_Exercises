
public class PhoneLauncher {

	public static void main(String[] args) {

		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch(); 
	}

	public void launch() {
		// your code creating and using SmartPhone here...
		SmartPhone phone = new SmartPhone("Nokia");

		System.out.println(phone.getBrand());


	//	xperia.call("0046746764");
	//	xperia.call("7837483473");

//		xperia.call("0129039484");
//		xperia.call("1129039484");
//		xperia.call("2129039484");
//		xperia.call("3129039484");
//		xperia.call("4129039484");
//		xperia.call("5129039484");
//		xperia.call("6129039484");
//		xperia.call("7129039484");
//		xperia.call("8129039484");
//		xperia.call("9129039484");
//		xperia.call("9129039484");
//		xperia.ringAlarm("Wake Up!");
//		xperia.printLastNumbers();
//		xperia.playGame("hello");
//		xperia.browseWeb("www.bbc.co.uk");
//		xperia.findPosition();
	} 
}