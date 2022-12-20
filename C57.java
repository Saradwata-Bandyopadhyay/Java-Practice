package practice;
import java.util.Scanner;
public class C57 {
	static int max(int a,int b,int c)
	{
		int max;
		if(a>b && a>c)
			max=a;
		else if(b>a && b>c)
			max=b;
		else max=c;
		return max;
	}
	static int min(int a,int b,int c)
	{
		int min;
		if(a<b && a<c)
			min=a;
		else if(b<a && b<c)
			min=b;
		else min=c;
		return min;
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num1,num2,num3,ma,mi;
	System.out.println("Enter first number => ");
	num1=sc.nextInt();
	System.out.println("Enter second number => ");
	num2=sc.nextInt();
	System.out.println("Enter third number => ");
	num3=sc.nextInt();
	ma=max(num1,num2,num3);
	mi=min(num1,num2,num3);
	System.out.println("Max => "+ma);
	System.out.println("Min => "+mi);
	sc.close();
	}

}
