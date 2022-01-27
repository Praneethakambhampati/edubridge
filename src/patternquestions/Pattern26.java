package patternquestions;

import java.util.Scanner;

public class Pattern26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		@SuppressWarnings("unused")
		int first, ans=1, iteration=1;
		for(int i=1;i<=n;i++)
		{
			System.out.print(" "+ans);
			iteration++;
			ans=ans+iteration;
			
			
		} 
	}


	}


