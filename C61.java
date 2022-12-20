package practice;
import java.util.Scanner;
public class C61 {
	static void pro(int num1,int num2)
	{
	int product=num1*num2;
	System.out.println("Product of "+num1+" and "+num2+" is => "+product);
	}
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	int num1,num2;
	System.out.println("Enter first number => ");
	num1=sc.nextInt();
	System.out.println("Enter second number => ");
	num2=sc.nextInt();
	pro(num1,num2);
	sc.close();
	}

}
