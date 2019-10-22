package sep29;

public class MultithreadingExcercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomThread ct  = new CustomThread();
		Thread t1 = new Thread(ct);
		
		
		Thread t2 = new Thread(ct);
		
		
		Thread t3 = new Thread(ct);		
		
		
		Thread t4 = new Thread(ct);
		
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		t4.setPriority(Thread.MAX_PRIORITY);

		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		System.out.println(t3.isAlive());
		System.out.println(t4.isAlive());
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();		
		
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		System.out.println(t3.isAlive());
		System.out.println(t4.isAlive());

	}

}

class CustomThread implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running "+Thread.currentThread().getName());
		System.out.println("Finished: "+Thread.currentThread().getName());
	}
}
