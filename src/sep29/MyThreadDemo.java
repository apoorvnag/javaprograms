package sep29;

public class MyThreadDemo {

	public static void main(String[] args) {
		MyThread mt = new MyThread();
		
		Thread t = new Thread(mt);
		t.setName("ignou");
		t.start();
		
		
	}
}

class MyThread implements Runnable{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running My Thread");
		for (int i=0;i<10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName() + " Sleeping for 1 second");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println(Thread.currentThread().getName() + " Interrupted");
			}
		}
		System.out.println("My Thread is complete");
	}
}
