

Matrix matrix1 = new Matrix(5,9)


matrix1.setElement(0,5,8)

println matrix1.array2D[2][5]
println matrix1.array2D[2][6]

matrix1.setRow(2,"1234")

matrix1.setColumn(2,"12345")

System.out.println(matrix1.toString())

matrix1.prettyPrint()