package javaprgm18;

public class deadLockDemo {
	String str1 = "java";
	String str2 = "unix";
	
	Thread thrd1 = new Thread("First thread") {
		public void run() {
			synchronized (str1) {
				try {
					System.out.println(Thread.currentThread().getName()+ " Locked "+ str1);
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (str2) {
					System.out.println(Thread.currentThread().getName()+ " Locked "+ str2);
					System.out.println(str1 + str2);
				}
			}
		}
	};
	
	Thread thrd2 = new Thread("Second Thread") {
		public void run() {
			synchronized (str2) {
				System.out.println(Thread.currentThread().getName()+ " Locked "+ str2);
				synchronized (str1) {
					System.out.println(Thread.currentThread().getName()+ " Locked "+ str1);
				System.out.println(str2 +str1);
				}	
			}
		}
	};
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		deadLockDemo dLock = new deadLockDemo();
		dLock.thrd1.start();
		dLock.thrd2.start();
		

	}

	

	

}
