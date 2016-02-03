


String str = 'zxcvbnmnvcxz'

int start = 0
int end = str.length()-1


boolean isPalindrome(String s, int start, int end) {

	char first = s.charAt(start)
	char last = s.charAt(end)

	if (start >= end) {
		return true
	} else if (first == last) {
		return isPalindrome(s, start+1, end-1)
	}

}



println isPalindrome(str, start,end)
