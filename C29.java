package practice;
import java.util.Scanner;
public class C29 {
	public static void main(String[] args) 
	{
	int num1,num2,sum,prod;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter two numbers => ");
	num1=sc.nextInt();
	num2=sc.nextInt();
	sum=num1+num2;
	prod=num1*num2;
	System.out.println("Sum of the numbers => "+sum);
	System.out.println("Product of the numbers => "+prod);
	sc.close();
	}

}
