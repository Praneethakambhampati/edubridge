package patternquestions;

import java.util.Scanner;

public class Pattern23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
@SuppressWarnings("resource")
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
				System.out.print("  "+i);
			else
			{
				System.out.print("  "+ (1+(i/2)*3));
			}
	}
	}
}

