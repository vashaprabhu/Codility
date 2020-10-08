package javaprgm2;

public class student implements Comparable<student>{
	
	String studName;
	int marks, regNum;
	
	public student(String studName, int marks, int regNum)
	{
		this.studName = studName;
		this.marks = marks;
		this.regNum = regNum;
		
	}

	@Override
	public int compareTo(student std) {
		if(marks == std.marks)
		return 0;
		else if(marks > std.marks)
		return -1;
		else
		return 1;
		
	}

}
