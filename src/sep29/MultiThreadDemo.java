package sep29;

public class MultiThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread3 t1 = new MyThread3();
		t1.setName("First Thread");
		t1.start();
		
		MyThread3 t2 = new MyThread3();
		t2.setName("Second Thread");
		t2.start();
	}

}

class MyThread3 extends Thread
{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("Running Thread: "+ Thread.currentThread().getName());
	}
	
}
