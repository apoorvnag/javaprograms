package sep28;

public class ThrowException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			fun();
		}catch (NullPointerException e) {
			System.out.println("caught inside main "+e);
		}finally {
			System.out.println("Bye");
		}
	}
	
	static void fun() {
		try {
			throw new NullPointerException("demo");
//		} catch (NullPointerException e) {
//			System.out.println("caught inside fun "+e);
//			throw e;
//		}
		}finally{
			System.out.println("finally");
		}
		
		
	}
	

}

class A{
	public int fun() {
		throw new NullPointerException();
	}
}
