
public class Calculator {

private int num1 = 0;
private int num2 = 0;

public Calculator() {

}


int add(int i, int j) {

	int total = i + j;
	return total;
}


int subtract(int i, int j) {
	
	int total = i - j;
	return total;
}

int multiply(int i, int j) {
	
	int total = i * j;
	return total;
}

double divide(int i, int j) {

	double d1 = (double) i;
	double d2 = (double) j;
	Double total = d1 / d2;
	return total;

}

int modulus(int i, int j) {

	int total = i % j;
	return total;

}

}