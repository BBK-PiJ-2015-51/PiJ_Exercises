import java.lang.Math

/*println "Type a number"
String str = System.console().readLine()
Integer num1 = Integer.parseInt(str)

println "Type another number"
String str2 = System.console().readLine()
Integer num2 = Integer.parseInt(str2)
*/
double power(int b, int e) {

	return Math.pow(b,e)
}

//println "power is " + power(num1,num2)

double power2(int e) {

	return power(2,e)
}

//println "power2 is " + power2(num2)

println  "Type in a binary number"
String str3 = System.console().readLine()


println  "Type in a decimal number"
String str4 = System.console().readLine()

Integer num = Integer.parseInt(str4)

int binary2decimal(String binary) {

int binLength = binary.length()-1
int total = 0
int count = 0
Integer bit = 0

while (binLength >= 0) {

	
	bit = Integer.parseInt(binary.substring(count,count+1))
	total = total + (bit * power2(binLength))
	binLength--
	count++
	
}
return total
}

println  "binary to decimal is " + binary2decimal(str3)


String decimal2Binary (int decimal) {

String binary = ""

while (decimal > 0) {

	binary = binary + (decimal % 2)
	decimal = decimal / 2
}
int binLength = binary.length()-1
String newBinary = ""

while (binLength>=0 ) {

newBinary = newBinary + binary.substring(binLength, binLength+1)
binLength--
}

return newBinary
}


println "decimal to binary is " + decimal2Binary(num)



