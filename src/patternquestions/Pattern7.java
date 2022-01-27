package patternquestions;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
@SuppressWarnings("resource")
Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the limit : ");
		int n=scanner.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1||i==n)
					System.out.print("*");
					
				else if(i!=1 && i!=n && j!=1 && j!=n)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
		
	}



	}


