package javaprgm6;
//Write a program to insert "tekarch" into vector then insert user inputed number(N) of Z's from 3rd position.delete N charactors from 6th position from vectorExample:if user input =5Then vector stores="tekZZZZZarch"Delete 5 character from 6th position so final string="tekZZZh"

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class prgm6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		int startAt = 3;
		Vector<Character> vec = new Vector<Character>();
		vec.add('t');
		vec.add('e');
		vec.add('k');
		vec.add('a');
		vec.add('r');
		vec.add('c');
		vec.add('h');
		
		System.out.println(vec);
		
		List<Character> li = new ArrayList<Character>();
		for(int i = 1; i <= 5; i++) {
			li.add('Z');
		}
		
		vec.addAll(3, li);
		System.out.println(vec);
		System.out.println(vec.size());
		
		for(int i = 6; i < vec.size()-1; i = i++) {
			vec.removeElementAt(i);
		}
		System.out.println(vec);
		
	
		
	

		
		
		
		

	}

}
