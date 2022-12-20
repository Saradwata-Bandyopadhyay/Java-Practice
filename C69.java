package practice;
import java.util.Scanner;
public class C69 {

	public static void main(String[] args) 
	{
	try (Scanner sc = new Scanner(System.in)) {
	int i,j,n=3;
	int arr[][]=new int [10][10];
	System.out.println("Enter values for the 2d array => ");
	for(i=0;i<n;i++)
	{
		for(j=0;j<3;j++)
		{
		arr[i][j]=sc.nextInt();
		}
	}
	System.out.println("Values in the 2d array => ");
	for(i=0;i<n;i++)
	{
		for(j=0;j<3;j++)
		{
		System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	}
	}
}
