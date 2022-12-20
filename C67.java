package practice;
import java.util.Scanner;
public class C67 {

	public static void main(String[] args) 
	{
	try (Scanner sc = new Scanner(System.in)) {
		int i,num,n=10,flag=0;
		System.out.println("Enter 10 numbers => ");
		int arr[]=new int[10];
		for(i=0;i<n;i++)
		arr[i]=sc.nextInt();
		System.out.println("Enter a number to search => ");
		num=sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(arr[i]==num)
				{
				System.out.println(num+" found at position "+(i+1));
				flag=1;
				break;
				}
		}
	if(flag==0)
		System.out.println(num+" not found.");
	}
	}
}
