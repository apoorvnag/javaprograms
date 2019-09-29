package sep29;

public class CurrentThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
		System.out.println("Original thread name: "+t.getName());
		t.setName("Ignou");
		System.out.println("After changing name: "+t.getName());
		
		for (int i = 0; i< 5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
		}
	}

}
