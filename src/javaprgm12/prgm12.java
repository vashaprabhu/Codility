package javaprgm12;

import java.util.PriorityQueue;


//Implement double ended queue using linked list, in which implement methods for the following i) Insert element at front ii) Delete element at front iii) Insert element at rear iv) Delete element at rear v) Display content of stack
public class prgm12 {
	
	public static void main(String[] args) {
		Queue q= new Queue();

		q.insertFront(5);
		q.insertFront(-1);
		q.insertFront(8);
		q.insertFront(9);
		q.insertFront(4);
		System.out.println("after adding front");

		q.displayQueue();
		
		q.enQue(10);
		q.enQue(12);
		q.enQue(14);
		System.out.println("after adding at rear");
		q.displayQueue();
		q.deQue();
		System.out.println("after front delete");
		q.displayQueue();
		q.deleteRear();
		System.out.println("after deleting rear");
		q.displayQueue();
	
	}
	
}
class QNode{
	int data;
	QNode next;
	
	public QNode(int data) {
		this.data = data;
		this.next = null;
	}
}

class Queue{
	QNode front, rear;
	
	public Queue() {
		this.front = this.rear = null;
	}
	
	public void enQue(int data)
	{
		QNode temp = new QNode(data);
		
		if(this.rear == null) {
			this.front = this.rear = temp;
			return;
		}
		this.rear.next = temp;
		this.rear = temp;
	}
	
	public void deQue()
	{
		if(this.front == null) {
			return;
		}
		QNode temp = this.front;
		this.front = this.front.next;
		if(this.front == null) {
			this.rear = null;
		}
	}
	
	public void insertFront(int data) {
		QNode temp = new QNode(data);
		
		if(this.front != null) {		
			temp.next = this.front;
			this.front = temp;
		}
		else if(this.rear == null) {
			this.front = this.rear = temp;
			return;
		}
		
	}
	
	public void displayQueue()
	{
		QNode iter = this.front;
		while( iter != null)
		{
			System.out.println(iter.data);
			iter = iter.next;	
		}
	}
	
	public void deleteRear()
	{
		QNode iter = this.front;
		while(iter.next != this.rear)
		{	
			iter = iter.next;
		}
		iter.next = this.rear;
		iter.next = null;
	}
}

