import java.lang.Math


class Integer2 {

int value

	int getValue() {
	return this.value
	}

	void setValue(int i) {
		this.value = i
	}

	boolean isEven() {
		boolean even
		if (this.value % 2 == 0) {
			even = true
		} else {
			even = false
		}
		return even
	}

	boolean isOdd() {
		boolean odd
		if (this.value % 2 == 0) {
			odd = false
		} else {
			odd = true
		}
		return odd
	}

	void prettyPrint() {
		println this.value
	}

	String toString() {
		String s = new String()
		s = this.value
	}

}

Integer2 i2 = new Integer2()
print "Enter a number: "
String str = System.console().readLine()
int i = Integer.parseInt(str)
i2.setValue(i)
print "The number you entered is "
if (i2.isEven()) {
	println "even."
}else if (i2.isOdd()) {
	println "odd."
} else {
	println "undefined!! Your code is buggy!"
}
int parsedInt = Integer.parseInt(i2.toString())
if (parsedInt == i2.getValue()) {
	println "Your toString() method seems to work fine."
}



