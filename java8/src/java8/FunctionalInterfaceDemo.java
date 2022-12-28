package java8;

import java.util.Scanner;

@FunctionalInterface
interface Addition1
{
	int Add(int a,int b);

}
interface Subtraction
{
	int sub1(int a,int b);
}
interface Multiplication
{
	int multiply(int a,int b);
}
interface Division
{
	int Divide(int a,int b);
}
public class FunctionalInterfaceDemo{

	public static void main(String[] args) 
	{
		
	
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a choice");
		int no=sc.nextInt();
		System.out.println("enter the first number");
		int a=sc.nextInt();
		
		System.out.println("enter the second number");
		int b=sc.nextInt();
		switch(no)
		{
		
		case 1:
			Addition1 add=(int m,int n)->m+n;
			int sum=add.Add(a,b);
			System.out.println(sum);
			break;
			
		case 2:
			Subtraction sub=(int m,int n)->m-n;
			int subt=sub.sub1(a,b);
			System.out.println(subt);
			break;
			
		case 3:
			Multiplication mul=(int m,int n)->m*n;
			int multi=mul.multiply(a,b);
			System.out.println(multi);
			break;
			
		case 4:
			Division div=(int m,int n)->m/n;
			float div1=div.Divide(a,b);
			System.out.println(div1);
			break;
			
		case 5:
			System.out.println("default");
			
		}
		
		
		
	}

}
