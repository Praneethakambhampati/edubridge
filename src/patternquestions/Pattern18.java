package patternquestions;

import java.util.Scanner;

public class Pattern18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
@SuppressWarnings("resource")
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			for(int j=n-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i*2+1;j++)
			{
				if(j%2==0)
					System.out.print("*");
				else 
					System.out.print(""+(i+1));
			}
			System.out.println();
		}
		for(int i=n-1;i>=0;i--)
		{
			for(int j=0;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=2 ;j<=(i*2) ;j++)
			{
				if(j%2==0)
					System.out.print(""+(i));
				else 	
					System.out.print("*");
			}
			System.out.println();	
		}
	}



	}


