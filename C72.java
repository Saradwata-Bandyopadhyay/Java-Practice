package practice;
import java.util.Scanner;
public class C72 {

	public static void main(String[] args) 
	{
try (	Scanner sc=new Scanner(System.in);)
{
	int n=10,i,j=0;
	int arr1[]=new int [10];
	int arr2[]=new int [5];
	int arr3[]=new int [5];
	System.out.println("Enter 10 numbers => ");
	for(i=0;i<n;i++)
	{
		arr1[i]=sc.nextInt();
	}
	for(i=0;i<5;i++)
	{
		arr2[i]=arr1[i];
	}
	for(i=5;i<n;i++)
	{
		arr3[j]=arr1[i];
		j++;
	}
	System.out.println("Values in first array => ");
	for(i=0;i<5;i++)
	{
		System.out.print(arr2[i]+" ");
	}
	System.out.println("\nValues in second array => ");
	for(i=0;i<5;i++)
	{
		System.out.print(arr3[i]+" ");
	}
	sc.close();
	}
}
}
