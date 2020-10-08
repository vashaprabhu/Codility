package InterviewPrgms;

import java.lang.reflect.Array;
import java.util.Arrays;

//WJP: given an array of elements print 1 even and 1 odd number in sorted way.
//input : 7 4 3 2 6
//output: 2 3 4 7 6
public class arrayPrgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] iArr = {7,4,3,2,6};
		int[] iOArr = new int[5];
		for(int i = 0; i < iArr.length ; i++) 
		{
			for(int j = i; j<iArr.length; j++) {
				if(iArr[i] > iArr[j])
				{
					int temp = iArr[i];
					iArr[i] = iArr[j];
					iArr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(iArr));
		for(int i = 0; i < iArr.length; i++) {
			if(iArr[i] % 2 == 0) {
				
			}
		}
			
		

	}

}
