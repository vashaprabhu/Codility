package javaprgm14;

public class Books implements Comparable<Books>{
	String name;
	int price;
	
	public Books(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public int compareTo(Books bObj) {
		// TODO Auto-generated method stub
		if( price > bObj.price)
		return 1;
		else
		return 0;
	}
	
	

}
