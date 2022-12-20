package practice;
import java.util.Scanner;
public class C36 {
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	int num1,num2;
	System.out.println("Enter first number => ");
	num1=sc.nextInt();
	System.out.println("Enter second number => ");
	num2=sc.nextInt();
	if(num1<50 && num1<num2)
		System.out.println("Both the conditions are true.");
	else
	System.out.println("Both conditions not met.");
	sc.close();
	}
}
