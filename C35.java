package practice;
import java.util.Scanner;
public class C35 {
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	int num1,num2,num3;
	System.out.println("Enter first number => ");
	num1=sc.nextInt();
	System.out.println("Enter second number => ");
	num2=sc.nextInt();
	System.out.println("Enter third number => ");
	num3=sc.nextInt();
	if(num1==num2 && num2==num3 && num3==num1)
		System.out.println("All are equal.");
	else if(num1==num2 || num2==num3 || num3==num1)
		System.out.println("Any two are equal.");
	else System.out.println("None are equal.");
	sc.close();
	}

}
