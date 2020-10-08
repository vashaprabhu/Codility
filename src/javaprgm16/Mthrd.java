package javaprgm16;
//Write a java program to create three threads T1, T2 and T3 and ensure sequence T1,T2,T3 in java.
public class Mthrd {
	
	
	Thread t1 = new Thread("First Thread") {
		public void run() {
			System.out.println("First Thread is running");
		}
	};
	
	Thread t2 = new Thread("Second Thread") {
		public void run() {
			System.out.println("Second Thread is running");
		}
	};
	Thread t3 = new Thread("Third Thread") {
		public void run() {
			System.out.println("Third Thread is running");
		}
	};
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Mthrd obj = new Mthrd();
		obj.t1.start();
		Thread.sleep(10);
		obj.t2.start();
		Thread.sleep(10);
		obj.t3.start();
	}

}
