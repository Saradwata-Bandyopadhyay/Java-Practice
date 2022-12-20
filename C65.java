package practice;
import java.util.Scanner;
public class C65 {
static void factorial(int num)
{
	int i;
	long fact=1;
	for(i=1;i<=num;i++)
	{
		fact=fact*i;
	}
	System.out.println("Factorial of "+num+" is => "+fact);
}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num;
	System.out.println("Enter a number to find its factorial => ");
	num=sc.nextInt();
	factorial(num);
	sc.close();
	}

}
