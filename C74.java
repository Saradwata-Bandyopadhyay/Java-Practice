package practice;
import java.util.Scanner;
public class C74 {

	public static void main(String[] args) 
	{
	int i,n=10,j=0;
	try(Scanner sc=new Scanner(System.in);)
	{
	System.out.println("Enter 10 elements => ");
	int arr[]=new int[10];
	int arr2[]=new int[5];
	for(i=0;i<n;i++)
	{
	arr[i]=sc.nextInt();	
	}
	System.out.println("Subarray => ");
	for(i=3;i<=8;i++)
	{
	arr2[j]=arr[i];
	j++;
	}
	for(i=0;i<arr2.length;i++)
	{
	System.out.println(arr2[i]+" ");	
	}
	}
	}

}
