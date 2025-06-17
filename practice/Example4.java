package practise;
import java.util.Scanner;

public class Example4 {
	
		static long factorial(int num)
		{
			if(num>0 && num<=1)
				return 1;
			return num*factorial(num-1);
		}
		static int fibo(int num)
		{
			if(num==0 && num>=0)
				return 0;
			if(num==1 && num>=0)
				return 1;
			return fibo(num-1)+fibo(num-2);
		}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter a number:");
			int n=sc.nextInt();
			System.out.println("Factorial will be: "+factorial(n));
			System.out.println("Fibonacci Series will be:");
			for(int i=0;i<n;i++)
			{
				System.out.println(fibo(i));
			}
		}
	}

