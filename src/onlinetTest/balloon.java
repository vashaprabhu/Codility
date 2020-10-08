package onlinetTest;

public class balloon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "BALLOON";
		String s1 = "BBAALLOOOOLLNNGGAA";
		sWord(s1, s);
//		System.out.println(n);

	}
	public static void sWord(String str, String str1) {
		int numOfWords= 0;
		String wrd = " ";
		for(int i = 0; i < str.length(); i++)
		{
			if(str.charAt(i) == 'B' || str.charAt(i) == 'B' || str.charAt(i) == 'L' || str.charAt(i) == 'O' || str.charAt(i) == 'N')
			{
				wrd = wrd + str.charAt(i);
//				System.out.println(wrd);
			}
		}
		System.out.println(wrd);
		
	}
	public void sort(String s) {
		for(int i = 0; i < s.length()-1; i ++) {
//			for(int j = 1; j < s.length())
		}
	}

}
