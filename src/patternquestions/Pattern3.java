package patternquestions;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scanner  =new Scanner(System.in);
		System.out.println("Enter the limit : ");
		int lt=scanner.nextInt();
		
		for(int i=0;i<=lt;i++)
		{
			for(int j=0;j<i;j++)
				System.out.print("*");
			System.out.println();
		}

	}



	}


