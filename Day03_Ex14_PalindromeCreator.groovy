import java.lang.Math

print "Type a word"
String str = System.console().readLine()

int right = str.length()-1

print str
while (right >=0) {
	print str.charAt(right)
	right--	
}

