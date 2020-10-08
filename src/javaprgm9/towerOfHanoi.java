package javaprgm9;

public class towerOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sourceToDestiny(4, "A", "B", "C");
	}
	
	public static void sourceToDestiny(int numOfDiscs, String source, String destiny, String temp )
	{
		if(numOfDiscs == 1) {
			System.out.println(numOfDiscs+" disc from "+source +" to "+destiny);
		}
		else {
			sourceToDestiny(numOfDiscs - 1, source, temp, destiny);
			System.out.println(numOfDiscs+ " disc from "+source +" to "+destiny);
			sourceToDestiny(numOfDiscs - 1, temp,  destiny, source);
			
		}
	}

}
