
boolean finished = false
boolean increasing = true
boolean decreasing = true
int previous_number = 0
int current_number = 0

println "Please enter a number:"
String str = System.console().readLine() 
previous_number = Integer.parseInt(str)

while (!finished) {

println "Please enter a number:"
String str2 = System.console().readLine()
current_number = Integer.parseInt(str2)

if (current_number == -1) {
	finished = true
}

else {
	if (current_number <= previous_number) {
		increasing = false
	}

	if (current_number >= previous_number) {
		decreasing = false
	}
}

previous_number = current_number

}

if (increasing || decreasing) {

	println "Yes"
}

else {

	println "No"
}

