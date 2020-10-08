package prgms1112;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.insert(1);
		list.insert(5);
		list.insert(4);
		list.insert(36);
		list.insert(8);
	
		list.display();
		System.out.println("after inserting at start");
		list.insertAtStart(12);
		list.insertAtStart(15);
		list.display();
		System.out.println("after inserting at index");
		list.insertAt(0, 9);
		list.insertAt(2, 25);
		list.display();
		System.out.println("after detyeting");
		list.deleteAt(2);
		list.display();
		
		
		System.out.println("stack ******************************");
		Stack st = new Stack();
		System.out.println(st.isEmpty());
		st.push(15);
		st.push(12);
		st.push(8);
		st.push(9);
		st.display();
		st.push(8);
		st.push(9);
		st.display();
		
		
		System.out.println("deleted item is: "+st.pop());
		System.out.println("deleted item is: "+st.pop());
		System.out.println("deleted item is: "+st.pop());
		System.out.println("deleted item is: "+st.pop());
		System.out.println("deleted item is: "+st.pop());
		System.out.println("deleted item is: "+st.pop());
		st.display();
		
		System.out.println("top item is: "+st.peek());
		st.display();
		
		System.out.println("size is: "+st.size());
//		st.display();
		System.out.println(st.isEmpty());
		

	}

}
