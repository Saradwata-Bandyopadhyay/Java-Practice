package practice;
import java.util.Scanner;
public class C54 {
	public static void main(String[] args) 
	{
	try (Scanner sc = new Scanner(System.in)) {
		int num1,num2,min,i,hcf=0;
		System.out.println("Enter first number => ");
		num1=sc.nextInt();
		System.out.println("Enter second number => ");
		num2=sc.nextInt();
		if(num1<num2)
			min=num1;
		else min=num2;
		for(i=1;i<=min;i++)
		{
			if(num1%i==0 && num2%i==0)
				hcf=i;
		}
		System.out.println("HCF of "+num1+" and "+num2+" is => "+hcf);
	}
	}
	}
