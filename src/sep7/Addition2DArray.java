package sep7;

import java.util.Scanner;

public class Addition2DArray {
	public static void main(String[] args) {
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int c[][]=new int[3][3];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first array");
		for (int i=0;i<a.length;i++)
		{
			for (int j=0;j < a[i].length;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter second array");
		for (int i=0;i<b.length;i++)
		{
			for (int j=0;j < b[i].length;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		
		for (int i=0;i<a.length;i++)
		{
			for (int j=0;j < a[i].length;j++) {
				c[i][j] =a[i][j]+b[i][j];
			}
		}
		
		
		System.out.println("Sum =");
		for (int i=0;i<b.length;i++)
		{
			for (int j=0;j < b[i].length;j++) {
				System.out.print(c[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
}
