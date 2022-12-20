package practice;
import java.util.Scanner;
public class C63 {
static void p (int num)
{
	int i,flag=0;
	if(num<2)
		System.out.println("Not a prime number!!!");
	else
	{
	for(i=2;i<=num/2;i++)
	{
		if(num%i==0)
		{
		System.out.println("Not a prime number!!!");
		flag=1;
		break;
		}
	}
	if(flag==0)
	System.out.println("Is a prime number!!!");
	}
}
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	int num;
	System.out.println("Enter a number to check it is prime or not => ");
	num=sc.nextInt();
	p(num);
	sc.close();
	}

}
