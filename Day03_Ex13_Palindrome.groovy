import java.lang.Math

println "Type a word"
String str = System.console().readLine()

int left = 0
int right = str.length()-1
boolean palindrome = true


while (palindrome && left < right) {


if (str.charAt(left) != str.charAt(right)) {
	palindrome = false
} else {

left++
right--

}

}

if (palindrome) {
	println "yes this is a palindrome"
} else {
	println "no this is not a palindrome"
}

