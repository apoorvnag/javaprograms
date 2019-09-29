package sep29;

public class MyThreadDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread2 mt = new MyThread2();
		mt.start();
	}
}

class MyThread2 extends Thread
{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("Concurrent Thread started running");
	}
}
