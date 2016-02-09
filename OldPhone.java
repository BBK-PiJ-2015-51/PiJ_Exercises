public class OldPhone implements Phone {
	
	String[] phoneHistory = new String[10];
	int addressSlot = 0;
	private String brand = null; 

	public OldPhone(String brand) {
	this.brand = brand; 
	}

	public String getBrand() { 
		return brand;
	}

	public void call(String number) {
		System.out.println("Calling" + number);
		addPhoneNumber(number);
	}


	void addPhoneNumber(String number) {
		phoneHistory[addressSlot] = number;
		if (addressSlot == 9) {
			addressSlot = 0;
		} else {
			addressSlot++;
		}
	}
}