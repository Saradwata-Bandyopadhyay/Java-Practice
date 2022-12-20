package practice;
import java.util.Scanner;
public class C66 {

	public static void main(String[] args) 
	{
	try (Scanner sc = new Scanner(System.in)) {
		int i,n=10;
		System.out.println("Enter 10 numbers => ");
		int arr[]=new int[10]; 
		for(i=0;i<n;i++)
		{
		arr[i]=sc.nextInt();
		}
		System.out.println("The 10 numbers are => ");
		for(i=0;i<n;i++)
		{
		System.out.println(arr[i]);
		}
	}
	}
}
