package javaprgm15;

public class priQueue  {
	
	int[] queue = new int[5];
	int front;
	int size;
	int rear;
	public void enqueue(int data)
	{
		if(!isFull())
		{
			queue[rear] = data;
			rear =(rear+1)%5;
			size++;
		}
		else {
			System.out.println("queue is full");
		}
	}
	
	public void display()
	{
		System.out.println("elements: ");
		for(int i = 0; i < size; i++)
		{
			System.out.print(queue[(front+i)%5] + " ");
		}
		System.out.println();
		for(int n : queue)
		{
			System.out.println(n + " ");
		}
	}
	
	public int dequeue()
	{
		int data = queue[front];
		if(!isEmpty())
		{
			front=(front+1)%5;
			size--;
		}
		else {
			System.out.println("queue is empty");
		}
		return data;
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean isFull() {
		return getSize() == 5;
	}
	
	public boolean isEmpty() {
		return getSize() == 0;
	}
	

}
