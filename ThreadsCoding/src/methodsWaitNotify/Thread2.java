package methodsWaitNotify;

public class Thread2 extends Thread{


	ThreadNotifyTest object;

	public Thread2(ThreadNotifyTest object, String name) {
		super(name);
		this.object = object;
	}

	@Override
	public void run() {
		synchronized (object) {
			
				System.out.println(Thread.currentThread().getName() + " notify thread" );
				object.notify();
				
				for (int i=0; i<10; i++) {
					System.out.println(Thread.currentThread().getName() + " " + i);
				}
			
		}
	}
}
