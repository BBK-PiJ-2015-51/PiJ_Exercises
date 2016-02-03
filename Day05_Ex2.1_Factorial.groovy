
//2.1 a) Factorial
//Write a small program with a method that calculates the factorial of an integer number as seen in the notes.
//Is it easy to do this both iteratively and recursively? Try both ways and see which is more natural for you. If
//one takes too long, try the other way.

int num = 5


int factorial(int n) {

	if (n==1) {
	return 1
	} else {
	int result = n * factorial(n-1)
	return result
	}
}


int factorialIter(int n) {

	int total = 1
	i = 1
	while (i < n) {
		i++
		total = total * i
		println total
	}
	return total
}


println factorialIter(num)

