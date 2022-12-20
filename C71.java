package practice;
import java.util.Scanner;
public class C71 {

	public static void main(String[] args) 
	{
	try (Scanner sc = new Scanner(System.in)) {
		int arr[]=new int [10]; 
		int i,n=10,j,count=0;
		System.out.println("Enter 10 elements => ");
		for(i=0;i<n;i++)
		{
		arr[i]=sc.nextInt();
		}
		j=arr.length-1;
		for(i=0;i<arr.length/2;i++)
		{
		if(arr[i]==arr[j])
		count++;
		j--;
		}
		if(count==arr.length/2)
			System.out.println("\nArray is palindrome.");
		else System.out.println("\nArray is not palindrome.");
		sc.close();
	}
	}

}
