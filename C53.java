package practice;
import java.util.Scanner;
public class C53 {
	public static void main(String[] args) 
	{
	try (Scanner sc = new Scanner(System.in)) {
		long fact=1;
		int num,i;
		System.out.println("Enter a number to find its factorial => ");
		num=sc.nextInt();
		for(i=1;i<=num;i++)
		{
		fact=fact*i;
		}
		System.out.println("Factorial of "+num+" is => "+fact);
	}
	}

}
