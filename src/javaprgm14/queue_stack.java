package javaprgm14;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class queue_stack {
	

	public static void main(String[] args) {
		System.out.println("queues ****************************************");
		Queue<Books> q = new PriorityQueue<Books>();
		q.add(new Books("java", 154));
		q.add(new Books("c++", 200));
		q.add(new Books("python", 150));
		q.add(new Books("go", 120));
		
		for(Books bq : q){
			System.out.println(bq.name+" ," +bq.price);
		}
		
		System.out.println("stacks ****************************************");
		
		Stack<Books> st = new Stack<Books>();
		st.add(new Books("kannada", 152));
		st.add(new Books("English", 120));
		st.add(new Books("Hindi", 150));
		
		for(Books bs : st) {
			System.out.println(bs.name+","+bs.price);
		}
		
	}

}
