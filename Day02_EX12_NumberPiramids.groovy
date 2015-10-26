println "Please enter a number"
String str = System.console().readLine()
int num = Integer.parseInt(str)
int count = 1
int count2 = 1


while (count <= num) {

	while(count2 > 0) {
	print count
	count2--
}
	println ""
	count++
	count2 = count
}



