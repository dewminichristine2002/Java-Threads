package implemntsRunnable;

public class Thread2 implements Runnable{

	
	public static void main(String[] args) {
		Thread thread = new Thread(new Thread2());
		
		thread.start();
		
		for (int i=0; i<10; i++) {
			System.out.println("Main Thread " + i);
		}
	}
	
	@Override
	public void run() {
		
		for (int i=0; i<10; i++) {
			System.out.println("New Thread " + i);
		}
	}

	
}
