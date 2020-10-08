package InterviewPrgms;
//WJP for a given string and delete a character in the string. use scanner and dont use inbuilt string functions
//input : java, a
//output: jv
public class removeChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "java";
		char ch = 'a';
		String temp = " ";
		char[] cStr = str.toCharArray();
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != ch) {
				temp = temp + str.charAt(i);
			}
		}
		System.out.println(temp);
		

	}

}
