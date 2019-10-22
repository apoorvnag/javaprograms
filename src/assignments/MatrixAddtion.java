package assignments;

public class MatrixAddtion {
	public static void main(String args[]){  
		//creating two matrices    
		int a[][]={
				{3,7,3,5},
				{2,8,5,3},
				{0,2,4,9},
				{4,1,7,2}
				};    
		int b[][]={
				{1,3,4,8},
				{2,4,3,7},
				{1,2,4,7},
				{4,1,7,2}
				};    
		    
		//creating another matrix to store the sum of two matrices    
		int c[][]=new int[4][4];  //4 rows and 4 columns  
		    
		//adding and printing addition of 2 matrices    
		for(int i=0;i<4;i++){    
			for(int j=0;j<4;j++){    
				c[i][j]=a[i][j]+b[i][j];    //use - for subtraction  
				System.out.print(c[i][j]+" ");    
			}    
			System.out.println();//new line    
		}   
	}
}
