package javaprgm7;

public class student implements Comparable<student> {
	
	String name;
	int regNum;
	public student(String name, int regNum) {
		this.name = name;
		this.regNum = regNum;
	}
	@Override
	public int compareTo(student std) {
		// TODO Auto-generated method stub
		if(regNum == std.regNum)
			return 0;
	    else if(regNum > std.regNum)
	    	return 1;
	    else
	    	return -1;
		
	}

}
