import java.lang.Math

println "what is the cost of the item"
String str = System.console().readLine()
double cost = Double.parseDouble(str)*100

println "how much are you going to pay?"
String str2 = System.console().readLine()
double pay = Double.parseDouble(str2)*100

int change = pay - cost

int change50 = 0
int change20 = 0
int change10 = 0
int change5 = 0
int change2 = 0
int change1 = 0
int change05 = 0
int change02 = 0
int change01 = 0
int change005 = 0
int change002 = 0
int change001 = 0

println "total change is " + change/100

while (change > 0) {

	if (change - 5000 >= 0) {
		change50++
		change = change-5000
	} else 

	if (change - 2000 >= 0) {
	change20++
	change = change-2000
	} else 

	if (change - 1000 >= 0) {
	change10++
	change = change-1000
	} else 

	if (change - 500 >= 0) {
	change5++
	change = change-500
	} else 

	if (change - 200 >= 0) {
	change2++
	change = change-200
	} else 

	if (change - 100 >= 0) {
	change1++
	change = change-100
	} else 

	if (change - 50 >= 0) {
	change05++
	change = change - 50
	} else 

	if (change - 20 >= 0) {
	change02++
	change = change-20
	} else 

	if (change - 10 >= 0) {
	change01++
	change = change-10
	} else 

	if (change - 5 >= 0) {
	change005++
	change = change-5
	} else 

	if (change - 2 >= 0) {
	change002++
	change = change-2
	} else 

	if (change - 1 >= 0) {
	change001++
	change = change-1
	}
}


if (change50 > 0) {
	println change50 + " x £50"
}

if (change20 > 0) {
	println change20 + " x £20"
}

if (change10 > 0) {
	println change10 + " x £10"
}

if (change5 > 0) {
	println change5 + " x £5"
}
if (change2 > 0) {
	println change2 + " x £2"
}
if (change1 > 0) {
	println change1 + " x £1"
}
if (change05 > 0) {
	println change05 + " x 50p"
}
if (change02 > 0) {
	println change02 + " x 20p"
}
if (change01 > 0) {
	println change01 + " x 10p"
}

if (change005 > 0) {
	println change005 + " x 5p"
}
if (change002 > 0) {
	println change002 + " x 2p"
}
if (change001 > 0) {
	println change001 + " x 1p"
}






