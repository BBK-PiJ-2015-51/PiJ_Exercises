import java.lang.Math

println "Type a number like 23,419.34"
String str = System.console().readLine()

//String str = "23,419.34"
int length = str.length()
int count = 0
String newnum = ""
int decplaces = 0

while (count < length) {

	if (str.charAt(count) == ',') {
		count++
	} 

	if (str.charAt(count) == '.') {
		
		count++
		
		while (count < length) {
			decplaces++
			newnum=newnum + str.charAt(count)
			count++
		} 

		} else {

			newnum = newnum + str.charAt(count)
			count++
		}

	}

Integer newnumint = Integer.parseInt(newnum) 
double numdouble = newnumint/Math.pow(10,decplaces)
double numHalf = numdouble/2
println "half the number is " + numHalf