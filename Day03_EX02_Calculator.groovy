println "Please enter a number"
String str = System.console().readLine()
double num1 = Double.parseDouble(str)

println("Please enter another number");
String str2 = System.console().readLine()
double num2 = Double.parseDouble(str2)

println("What would you like to do?");
println("+");
println("-");
println("*");
println("/");

println("enter operator");

String operator = System.console().readLine()


if (operator.equals("+")) {
	
	println num1 + num2
} 


if (operator.equals("-"))  {
	
	println num1 - num2
}

if (operator.equals("*"))  {
	
	println num1 * num2
} 

if (operator.equals("/"))  {
	
	println num1 / num2
}

