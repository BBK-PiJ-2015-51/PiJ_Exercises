
void printNumbers(int n) {
	if (n <= 0) {
		return
	}
	println n
	printNumbers(n-2)
	printNumbers(n-3)
	println n
}

printNumbers(6)


//          6436
//    4214    3103
//20-12  1-1-21   1-1-41
//
// 642211431136
//
//
//
//

String buggyMethod(int n) { 
	if (n == 0) {
		return ""; 
	}
	return n + " " + buggyMethod(n - 2); 
	
}
//if its an odd number it will never equal 0 and so will end up reducing to infinity.
