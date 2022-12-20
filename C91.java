package practice;
import java.util.Scanner;
class Average
{
int num1,num2,num3;
Average(int n1,int n2,int n3)
{
num1=n1;
num2=n2;
num3=n3;
}
double avg()
{
return (num1+num2+num3)/3;
}
}
public class C91 
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	int n1,n2,n3;
	System.out.println("Enter first number => ");
	n1=sc.nextInt();
	System.out.println("Enter second number => ");
	n2=sc.nextInt();
	System.out.println("Enter third number => ");
	n3=sc.nextInt();
	Average a=new Average(n1,n2,n3);
	System.out.println("Average of the numbers => "+a.avg());
	sc.close();
	}
}
