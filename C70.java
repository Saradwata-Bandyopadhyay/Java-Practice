package practice;
import java.util.Scanner;
public class C70 {
static int maximum(int arr[])
{
	int max,i;
	max=arr[0];
	for(i=0;i<arr.length;i++)
	{
	if(max<arr[i])
	max=arr[i];
	}
	return max;
}
static int minimum(int arr[])
{
	int min,i;
	min=arr[0];
	for(i=0;i<arr.length;i++)
	{
	if(min>arr[i])
	min=arr[i];
	}
	return min;
}
	public static void main(String[] args) 
	{
	try(Scanner sc=new Scanner(System.in);)
	{
	int arr[]=new int[10];
	int i,max,min;
	System.out.println("Enter 10 numbers => ");
	for(i=0;i<10;i++)
	{
		arr[i]=sc.nextInt();
	}
	max=maximum(arr);
	min=minimum(arr);
	System.out.println("Maximum of the array => "+max);
	System.out.println("Minimum of the array => "+min);
	}
	}

}
