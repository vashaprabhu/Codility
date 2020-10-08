package javaprgm8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

//Store user defined employee objects into arraylist and Remove duplicates from arraylist without using collections.
public class entry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<employee> aList = new ArrayList<employee>();
		aList.add(new employee("aaa", 101));
		aList.add(new employee("bbb", 102));
		aList.add(new employee("ccc", 103));
		aList.add(new employee("ddd", 104));
		aList.add(new employee("eee", 105));
		aList.add(new employee("sss", 101));
		
		List<Integer> li = new ArrayList<Integer>();
		
		Iterator<employee> itr = aList.iterator();
		while(itr.hasNext()) {
			li.add(itr.next().e_num);
		}
		System.out.println(li);
		Collections.sort(li);
		System.out.println(li);
		Integer num = li.get(0);
		if(li.contains(num)) {
			System.out.println(li.remove(num));
			System.out.println(li);
		}
		
	}

}
