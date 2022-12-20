package practice;
import java.util.Scanner;
public class C73 {

	public static void main(String[] args) 
	{
	try(Scanner sc=new Scanner(System.in);)
	{
	int size,i,j,temp;
	System.out.println("Enter size of the Array => ");
	size=sc.nextInt();
	int arr[]=new int [size];
	for(i=0;i<size;i++)
		arr[i]=sc.nextInt();
	for(i=0;i<size;i++)
	{
		for(j=0;j<size;j++)
		{
		if(arr[i]<arr[j])
		{
		temp=arr[j];
		arr[j]=arr[i];
		arr[i]=temp;
		}
		}
	}
	System.out.println("Maximum Difference => "+(arr[size-1]-arr[0]));
	System.out.println("Minimum Difference => "+(arr[1]-arr[0]));
	sc.close();
	}
	}
}
