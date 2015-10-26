
println "please enter some text"
String str = System.console().readLine()
int count = 0

for(int i = 0; i < str.length(); i++ ) {

	if (str.charAt(i) == "e") {
		count++
		} 
	}
println "the letter e appears " + count + " times"