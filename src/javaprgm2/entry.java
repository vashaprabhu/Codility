package javaprgm2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//Write a java program to store 5 student information and award the students with 1st rank, 2nd rank and 3rd rank according to marks obtained where each student has student name, student marks and student reg no information
public class entry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<student> studList = new ArrayList<student>();
		studList.add(new student("aru", 380, 102));
		studList.add(new student("vish", 500, 105));
		studList.add(new student("smi", 410, 103));
		studList.add(new student("mina", 510, 104));
		studList.add(new student("sen", 489, 101));
		
		Collections.sort(studList);
		
		System.out.println("Ranks goes on Ascending order as per marks below, highest is first and lowest is last");
		System.out.println("**************************************************************************************");
		
		for(student st : studList) {
			System.out.println(st.studName +" "+st.marks+" "+st.regNum);
		}
	
	}

}
