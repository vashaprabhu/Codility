package javaprgm11;

import java.util.LinkedList;

public class SinglyLinkedList {
	
	public Node head = null;
	public Node tail = null;
	
	class Node{
		
		int data;
		Node next;
	
		public Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	public void insertNode(int data)
	{
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	public void displayLList()
	{
		Node currentNode = head;
		while(currentNode != null)
		{
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}
		
	}
	
	public void deleteNode(int key)
	{
		Node temp = head, prev = null;
		if(temp != null && temp.data == key)
		{
			head = temp.next;
			return;
		}
		while(temp != null && temp.data != key)
		{
			prev = temp;
			temp = temp.next;
		}
		
		if(temp == null)
		{
			return;
		}
		prev.next = temp.next;
		
	}
	
	public static void main(String [] args)
	{
		SinglyLinkedList list = new SinglyLinkedList();
		list.insertNode(1);
		list.insertNode(2);
		list.insertNode(5);
		list.insertNode(11);
		
		System.out.println("after insertion");
		list.displayLList();
		
		list.deleteNode(1);
		System.out.println("After deleting");
		list.displayLList();
	
	}

	

}
