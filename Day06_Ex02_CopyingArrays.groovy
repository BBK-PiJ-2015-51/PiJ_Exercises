
int[] array1 = new int[5]
array1[0] = 1
array1[1] = 2
array1[2] = 3
array1[3] = 4
array1[4] = 5

int[] array2 = new int[8]
array2[0] = 1
array2[1] = 4
array2[2] = 9
array2[3] = 16
array2[4] = 25
array2[5] = 36
array2[5] = 49
array2[5] = 64

ArrayCopier newArray = new ArrayCopier()

//array2 = newArray.copy(array1,array2)
newArray.copy(array1,array2)

for(int i =0; i< array2.length; i++)
	println(array2[i])


