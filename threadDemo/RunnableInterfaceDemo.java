package threadDemo;


class Hi implements Runnable{
	
//	Runnable interface is a Functional Interface it contain only one abstract method
	@Override
	public void run(){
		for(int i = 0; i<5; i++) {
			System.out.println("hiii");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


public class RunnableInterfaceDemo {

	public static void main(String[] args) throws InterruptedException {
		
		Runnable obj1 = new Hi();
		
//		Anonymous class Using lambda expression 
		Runnable obj2 = ()->{
			for(int i=0; i<5; i++) {
				System.out.println("Hello");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		};
		
//		First way to create thread
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
//		get the name of the thread
		System.out.println(t1.getName());
		
		
//		give a name to the thread
		t1.setName("Hii Thread");			// first way
		Thread t3 = new Thread(new Hi(),"Thread--3");		//second way
		
		System.out.println(t3.getName());
		
		
		
//		set the priority of the thread  default priority is 5
//		Thread class contain 3 constant variable 
//			1.  MAX_PRIORITY   ---    10
//			2.  MIN_PRIORITY   ---     1
//			3.  NORM_PRIORITY   ---    5
		
		t2.setPriority(Thread.MAX_PRIORITY);	// pass any int value between 1 to 10 as parameter
		
		
//		get the priority of the theread
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
		
		
		t1.start();		// start method of Thread class will call  the run method of parameter class
		try {Thread.sleep(100);} catch(Exception e) {}
		t2.start();
		
		
//		isAlive() method check if thread is in running state of not
		System.out.println(t1.isAlive());
		
		
//		Join the execution of both thread to with main thread
		t1.join();
		t2.join();
		
		System.out.println(t1.isAlive());  // It will print false because thread is not in running state
		
		System.out.println("Print After the execution of both thread");
		
	}

}
