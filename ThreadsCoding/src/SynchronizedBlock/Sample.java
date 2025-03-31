package SynchronizedBlock;

public class Sample {

public void displayOutput(Sample sample) {
		
	 //synchronized (sample)  //thread synchronized block
	synchronized (new Sample()) { //thread is synchronized with lock change, each thread get seperate object to lock
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
}
