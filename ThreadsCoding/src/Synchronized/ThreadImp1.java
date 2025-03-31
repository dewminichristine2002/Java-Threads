package Synchronized;


public class ThreadImp1 extends Thread {

	Sample sample;
	String name;
	public static final String THREAD0 = "Thread 0";
	public static final String THREAD1 = "Thread 1";
	
	public ThreadImp1(Sample sample, String name) {
		
		this.sample = sample;
		this.name = name;
	}
	
	public static void main(String[] args) {
		
		Sample sample = new Sample();
		
		ThreadImp1 threadImp1 = new ThreadImp1(sample, THREAD0);
		ThreadImp1 threadImp2 = new ThreadImp1(sample, THREAD1);
		
		threadImp1.start();
		threadImp2.start();
}
	@Override
	public void run() {
		sample.displayOutput(sample);
	}
}
