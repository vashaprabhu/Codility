package onlinetTest;

import java.util.HashMap;

public class formBalloon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ABLOONGLBBBAAALLLLOOOONN";
		String s1 = "BALLOON";
		int words = formWord(s, s1);
		System.out.println(words);
	}
	public static int formWord(String str,  String strToForm)
	{
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int aCount = 0;
		int bCount = 0;
		int lCount = 0;
		int oCount = 0;
		int nCount = 0;
		
		int numOfWords = 0;
		char[] cStr = str.toCharArray();
		for(int i = 0; i< cStr.length; i++) {
			switch(cStr[i]) {
			case 'A' :
				aCount++;
				map.put(cStr[i], aCount);
				break;
			case 'B' :
				bCount++;
				map.put(cStr[i], bCount);
				break;
			case 'L' : 
				lCount++;
				map.put(cStr[i], lCount);
				break;
			case 'O' :
				oCount++;
				map.put(cStr[i],oCount);
				break;
			case 'N' :
				nCount++;
				map.put(cStr[i], nCount);
				break;
			default:	
				System.out.println("Non Relavent letter "+cStr[i]);	
			}
		}
		while(bCount > 0 && aCount > 0 && oCount > 1 && lCount > 1 && nCount > 0) {
				numOfWords++;
				bCount--;
				aCount--;
				oCount = oCount - 2;
				lCount = lCount - 2;
				nCount--;
			}
		
		return numOfWords;
	
		
	}

}
