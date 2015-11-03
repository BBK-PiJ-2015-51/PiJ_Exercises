
public class ArrayCopier 
{

	public void copy(int[] src, int[] dst) {

		int numberOfIterations = 0;
		boolean completeWithZeros = false;

		if (src.length < dst.length) {
			numberOfIterations = src.length;
			completeWithZeros = true;

		} else {
			numberOfIterations = dst.length;
		}

		for(int i = 0; i<numberOfIterations;i++)
		
			{
				dst[i] = src[i];
			
			}
		
		;

		if (completeWithZeros) {

		for(int startZeros = src.length ; startZeros < dst.length; startZeros++) 

			{
			dst[startZeros] = 0;
			}
		
		}
		
		//return dst;
	}


}