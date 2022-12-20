package practice;
import java.util.Scanner;
public class C49 {
	public static void main(String[] args) {
	try (Scanner sc = new Scanner(System.in)) 
	{
		int i,n=10,num;
		double sum=0;
		System.out.println("Enter 10 numbers => ");
		for(i=0;i<n;i++)
		{
		num=sc.nextInt();
		sum=sum+num;
		}
		System.out.println("Average of 10 numbers => "+(sum/10));
		sc.close();
	}
	}
}
