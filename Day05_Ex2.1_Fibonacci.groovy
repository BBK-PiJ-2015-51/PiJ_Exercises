
//2.1 a) Factorial
//Write a small program with a method that calculates the factorial of an integer number as seen in the notes.
//Is it easy to do this both iteratively and recursively? Try both ways and see which is more natural for you. If
//one takes too long, try the other way.

int num = 7


int fibonacci(int n) {

	if (n==1 || n==2) {
	return 1
	} else {
	int result = fibonacci(n-2) + fibonacci(n-1)
	return result
	}
}



println fibonacci(num)

