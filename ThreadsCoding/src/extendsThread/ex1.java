package extendsThread;

public class ex1  extends Thread{
	
	public static void main(String[] args) {
		
		
		ex1 thread1 = new ex1();
		
		thread1.start();
		for (int i=0; i<10; i++) {
			System.out.println("Main Thread " + i);
		}
		
	}


	public void run() {
		for (int i=0; i<10; i++) {
			System.out.println("New Thread " + i);
		}
	}
	
	
}
