package methods;

public class join extends Thread {

  public static void main(String[] args) throws Exception {
	
	  Thread t = new Thread(new join(), "New Thread"); 
	  
	  t.start();
	  
	  System.out.println("started executing main thread.");
	  
	  t.join(); //The join method is called on the thread t. This causes the main thread to wait until the thread t has finished executing.
	  
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
