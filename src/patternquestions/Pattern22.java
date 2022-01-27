package patternquestions;

import java.util.Scanner;

public class Pattern22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
@SuppressWarnings("resource")
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		int sum=1;
		for(int i=1;i<=n;i++)
		{
			System.out.print(" "+sum );
			sum=sum+2;
		}


	}



	}


