package practice;
import java.util.Scanner;
public class C68 {

	public static void main(String[] args) 
	{
	try (Scanner sc = new Scanner(System.in)) {
		int arr1[]=new int[10];
		int arr2[]=new int[10];
		int n=10,i,j=9;
		System.out.println("Enter 10 numbers => ");
		for(i=0;i<n;i++)
		{
		arr1[i]=sc.nextInt();
		arr2[j]=arr1[i];
		j--;
		}
		System.out.println("After reversing => ");
		for(i=0;i<n;i++)
		{
		System.out.println(arr2[i]);
		}
	}
	}

}
