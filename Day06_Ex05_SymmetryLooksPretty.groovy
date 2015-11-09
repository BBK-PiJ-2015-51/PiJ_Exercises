
int[] newint = new int[6]

newint[0] = 1
newint[1] = 2
newint[2] = 3
newint[3] = 3
newint[4] = 2
newint[5] = 2

int[][] newMatrix = new int[3][4]

newMatrix[0][0] = 1
newMatrix[0][1] = 1
newMatrix[0][2] = 5
newMatrix[0][3] = 1
newMatrix[1][0] = 1
newMatrix[1][1] = 1
newMatrix[1][2] = 0
newMatrix[1][3] = 1
newMatrix[2][0] = 8
newMatrix[2][1] = 0
newMatrix[2][2] = 1
newMatrix[2][3] = 1


MatrixChecker checker1 = new MatrixChecker()

println checker1.isSymmetrical(newMatrix)