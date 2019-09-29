package sep28;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String();
		System.out.println(s1);
		
		char c[]= {'p','e', 't', 'e', 'r'};
		String s2=new String(c);
		System.out.println(s2);
		
		char c2[]= {'m','a', 'r', 'y'};
		String s3=new String(c2, 1,3);
		System.out.println(s3);
		
		System.out.println("abc".length());
		
		String age="9";
		String s="My age is "+age+ " years.";
		System.out.println(s);
		
		System.out.println("Four " + 2 + 2);
		System.out.println("Four " + (2 + 2));
		
	
		StringBuffer sb1=new StringBuffer("Hello");
		System.out.println(sb1);
		
		System.out.println(sb1.length());
		System.out.println();
		
	}

}
