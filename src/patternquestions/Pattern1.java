package patternquestions;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Limit :  ");
		int n=scanner.nextInt();
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				System.out.print("*");
			System.out.println();
		}
	}



	}


