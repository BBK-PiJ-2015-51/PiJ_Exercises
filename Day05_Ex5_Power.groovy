

//5 Power
//Create a class with a method pow that takes two integers (base and exponent) and calculates the power, e.g. pow(2,3) calculates 23.
//Is it easy to do this both iteratively and recursively?



int pow(int b, int e) {

if (e ==0) {
	return 1
} else  {
	return b * pow(b,e-1)
}

}


println pow(5,2)