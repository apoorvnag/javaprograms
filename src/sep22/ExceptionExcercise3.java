package sep22;

public class ExceptionExcercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int a = Integer.parseInt(args[0]);
			System.out.println(a);
		} catch(NumberFormatException e)
		{
			System.out.println(e);
		}
		
	}

}
