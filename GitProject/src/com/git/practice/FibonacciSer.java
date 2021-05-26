package com.git.practice;



import java.util.Scanner;

public class FibonacciSer {
	
	public static void main(String[] args) {
		
		int a=0,b=1,c=0;
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		
		for(int i=0;i<num;i++)
		{
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
			
		}
		
		sc.close();
		
	}

}

