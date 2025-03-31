package methods;

public class yeild extends Thread{

	 public static void main(String[] args) throws Exception {
			
		  Thread t = new Thread(new yeild(), "New Thread"); 
		  
		  t.start();
		  
		  System.out.println("started executing main thread.");
		  
		  t.yield(); 
		  /*The yield method is called on the thread t. However, this is a bit misleading. 
		   * Thread.yield() is a static method that always affects the currently executing thread, not the thread t directly.
		
			*In this context, it causes the main thread to yield its execution, 
			*hinting to the thread scheduler that it can pause the main thread and allow other threads (like t) to execute. 
			*However, there's no guarantee that this will happen.*/
		
		  for(int i=0; i<10; i++) {
			  System.out.println(Thread.currentThread().getName() + i);
		  }
		  
		 System.out.println("finished executing " + Thread.currentThread().getName());
		  
	}

	@Override
	public void run() {
		Thread t = Thread.currentThread(); //t has been equaled to the current thread thats it
		
		System.out.println("started executing " + t.getName()); 
		
		 for(int i=0; i<10; i++) {
			  System.out.println(t.getName() + i);
		  }
		 
		 System.out.println("finished executing " + t.getName());
	}
	  
	
}
