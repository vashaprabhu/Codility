package javaprgm13;

public class CircleQueue {
	
	int size = 5;
	int front, rear;
	int arr[] = new int[size];
	
	public CircleQueue ()
	{
		front = -1;
		rear = -1;
	}
	
	public boolean isQFull(){
		if(front == 0 && rear == size -1) {
			return true;
		}
		if(front == rear + 1)
		{
			return true;
		}
		return false;
	}
	
	public boolean isQEmpty() {
		if(front == -1) {
			return true;
		}
		return false;
	}
	
	public void enQueue(int data) {
		if(isQFull()) {
			System.out.println("queue is full");
		}else
		{
			if(front == -1) {
				front = 0;
			}
			rear = (rear+1) % size;
			arr[rear] = data;
		}
	}
	
	public int deQueue() {
		int data;
		if(isQEmpty()) {
			System.out.println("queue is empty");
			return (-1);
		}
		else {
			data = arr[rear];
			if(front == rear) {
				front = -1;
				rear = -1;
			}
			else {
				front = (front + 1 ) % size;
			}
			return data;
		}		
	}
	public void display() {
		int i;
		if(isQEmpty()) {
			System.out.println("queue empty");
		}
		else {
			for(i = front; i!= rear; i=(i+1)%size)
			{
				System.out.println(arr[i]);
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircleQueue cque = new CircleQueue();
		int ele = cque.deQueue();
		System.out.println("deleted ele is "+ele);
		cque.enQueue(1);
//		cque.enQueue(2);
//		cque.enQueue(3);
//		cque.enQueue(4);
//		cque.enQueue(5);
//		ele = cque.deQueue();
//		System.out.println("deleted ele is "+ele);
		cque.display();
		

	}

}
