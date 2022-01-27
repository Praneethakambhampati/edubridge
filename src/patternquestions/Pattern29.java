package patternquestions;

import java.util.Scanner;

public class Pattern29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
@SuppressWarnings("resource")
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		int n=sc.nextInt();
		
		int sum=1;
		for(int i=2;i<=n+1;i++)
		{
			
			System.out.print( " "+sum );
			sum=sum*i;
		}

	}



	}


