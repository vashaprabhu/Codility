package javaprgm4;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

//Write a java program to store 5 unique elements in sorted order. Error should exist if user tries to add duplicates.

public class prgm4 {

	public static void main(String[] args) {
		
		Set<String> elSet = new TreeSet<String>();
		elSet.add("var");
		elSet.add("mar");
		elSet.add("kar");
		elSet.add("sar");
		
		Iterator<String> itr = elSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		String s = "kar";
//		elSet.add(s);
		if(elSet.contains(s)) {
			System.out.println("already exists");
		}
		else {
			System.out.println("can add");
		}
		

	}
	

}
