package Synchronized;

public class Sample {

public synchronized void displayOutput(Sample sample) {
		
		try {
			for(int i=0; i<10; i++) {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
