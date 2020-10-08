package javaprgm7;
//Write a java program to implement your own ArrayList which has two methods a) add b) remove and store 5 student information in your ArrayList.
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class entry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<student> aLi = new ArrayList<student>();
		aLi.add(new student("vvv", 101));
		aLi.add(new student("aaa", 105));
		aLi.add(new student("ggg", 109));
		aLi.add(new student("ddd", 103));
		aLi.add(new student("uuu", 106));
		aLi.add(new student("zzz", 108));
		
		Collections.sort(aLi);
		
		for(student st : aLi )
		{
			System.out.println(st.name + " "+st.regNum);
		}
		
		System.out.println("After removing");
		
		aLi.remove(2);
		for(student st : aLi )
		{
			System.out.println(st.name + " "+st.regNum);
		}
	}

}
