package patternquestions;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
@SuppressWarnings("resource")
Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the Number : ");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i*2+1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>=0;j--)
			{
				System.out.print(" ");
			}
			for(int j=(n-i-1)*2+1; j>=1;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}



	}


