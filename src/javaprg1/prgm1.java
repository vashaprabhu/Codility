package javaprg1;
//Write a java program to store 5 student information in a treeMapNote: student object has student name and student reg no

import java.util.Map;
import java.util.TreeMap;

public class prgm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Map<Integer, String> stdDetail = new TreeMap<Integer, String>();
		stdDetail.put(100, "yam");
		stdDetail.put(98, "rim");
		stdDetail.put(90, "sim");
		stdDetail.put(102, "gim");
		stdDetail.put(105, "jim");
		
		for(Map.Entry e : stdDetail.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
		
	
		

	}


}
