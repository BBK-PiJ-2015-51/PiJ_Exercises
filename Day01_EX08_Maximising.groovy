
boolean finished = false
int maximum = 0

while (!finished) {

println "Please enter a number:"
String str = System.console().readLine() 
int i = Integer.parseInt(str)

if (i == -1) {
	finished = true
}

else {
	if (i > maximum) {
		maximum = i
	}
}
}

println "The maximum number is " + maximum