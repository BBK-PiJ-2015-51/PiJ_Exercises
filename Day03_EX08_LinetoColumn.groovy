
println "please enter some text"
String str = System.console().readLine()


for(int i = 0; i < str.length(); i++ ) {

	if (str.charAt(i) == " ") {
		println ""
		} else {
			print str.charAt(i)
		}
	}
