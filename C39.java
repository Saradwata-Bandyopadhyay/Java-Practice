package practice;
import java.util.Scanner;
public class C39 {
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	int num1,num2;
	System.out.println("Enter first number =>");
	num1=sc.nextInt();
	System.out.println("Enter second number =>");
	num2=sc.nextInt();
	if(num1>num2)
		System.out.println(num1+" is bigger.");
	else if(num1<num2) 
		System.out.println(num2+" is bigger.");
	else System.out.println("Both are equal.");
	sc.close();
	}

}
