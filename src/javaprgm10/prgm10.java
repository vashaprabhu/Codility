package javaprgm10;

import java.util.Stack;

//Write a java program to implement your own stack data structure to store any number of items. And implement the following operations 1.push 2. pop 3. peek 4.display stack content
public class prgm10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stk = new Stack<Integer>();
		stk.push(10);
		stk.push(15);
		stk.push(20);
		stk.push(25);
		stk.push(30);
//		System.out.println(stk);
		
		stk.pop();
//		System.out.println(stk);
		stk.pop();
//		System.out.println(stk);
		stk.push(35);
//		System.out.println(stk);
		System.out.println(stk.peek());
		System.out.println(stk);
		

	}

}
