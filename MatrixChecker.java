
public class MatrixChecker {

	public boolean isSymmetrical (int[] i) {

		int start = 0;
		int end = i.length-1;
		boolean symmetrical = true;

		while(start <= end ) {

			if (i[start] != i[end]) {
			symmetrical = false;
			}
			start++;
			end--;
		}

		return symmetrical;
	}

	public boolean isSymmetrical (int[][] m) {

		boolean symmetrical = true;

			for(int i = 0; i < m.length-1; i++) {

				for(int j = 0; j < m[0].length-1; j++) {

					if (m[i][j] != m[j][i]) {
					symmetrical = false;
					}
				}
			
			}
		return symmetrical;
		}

}

