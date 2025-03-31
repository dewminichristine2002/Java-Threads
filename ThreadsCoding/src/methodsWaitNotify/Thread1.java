package methodsWaitNotify;

public class Thread1 extends Thread {

	ThreadNotifyTest object;

	public Thread1(ThreadNotifyTest object, String name) {
		super(name);
		this.object = object;
	}

	@Override
	public void run() {
		synchronized (object) {
			
			try {
				
				System.out.println("started " + Thread.currentThread().getName()+ " wait");
				object.wait();
				
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			for (int i=0; i<10; i++) {
				System.out.println(Thread.currentThread().getName() + " " + i);
			}
		}
	}
	
	
}
