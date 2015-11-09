

public class Matrix {

	private int[][] array2D;


	public Matrix(int m, int n) {

		array2D = new int[m][n];

		for(int i=0; i < m; i++) {

			for (int j = 0; j< n; j++) {

				array2D[i][j] = 1;
			}
		}

	}

	
	public void setElement(int i, int j, int k) {

		if(i < array2D.length && j < array2D[0].length) {

			array2D[i][j] = k;
		}
	}
	
	public void setRow(int k, String s) {
		
		if (s.length() <= array2D[0].length) {

			for(int i = 0; i < s.length();i++) {

				String t = "" + s.charAt(i);
				Integer m = Integer.parseInt(t);
				array2D[k][i] = m;
			}
		}	

		}
	
		public void setColumn(int k, String s) {
		
		if (s.length() <= array2D.length) {

			for(int i = 0; i < s.length();i++) {

				String t = "" + s.charAt(i);
				Integer m = Integer.parseInt(t);
				array2D[i][k] = m;
			}
		}	

		}

		public String toString() {

			String s = "[";

			for(int i = 0; i < array2D.length; i++) {

				for(int j = 0; j < array2D[0].length; j++) {

					s = s + array2D[i][j];
					s = s + ",";
				}
			}
			s = s + "]";
			return s;
		}


		public void prettyPrint() {

			for(int i = 0; i < array2D.length; i++) {

				for(int j = 0; j < array2D[0].length; j++) {

					System.out.print(array2D[i][j]);
				}
			System.out.println("");
			}
			
		}


}