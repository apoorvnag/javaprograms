package sep7;

import java.util.Scanner;

public class ReverseOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int backup = n;
		int reverse = 0;
		while(n!=0) {
			int digit=n%10;
			reverse *= 10;
			reverse += digit;
			
			n/=10;
		}
		System.out.println("Reverse of a number " + reverse);
		
		
	}
}
