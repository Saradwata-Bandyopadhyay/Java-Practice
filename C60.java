package practice;
import java.util.Scanner;
public class C60 {
	static void sum(int num1,int num2)
	{
	int sum=num1+num2;
	System.out.println("Sum of "+num1+" and "+num2+" is => "+sum);
	}
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	int num1,num2;
	System.out.println("Enter first number => ");
	num1=sc.nextInt();
	System.out.println("Enter second number => ");
	num2=sc.nextInt();
	sum(num1,num2);
	sc.close();
	}

}
