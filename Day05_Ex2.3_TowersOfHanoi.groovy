

int num = 4


int towerOfHanoi(int n) {

	if (n==1) {
	return 1
	} else {
	int result = n + 2 * (towerOfHanoi(n-1))
	return result
	}
}



println towerOfHanoi(num)
