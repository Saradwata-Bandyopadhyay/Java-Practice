package practice;
import java.util.Scanner;
public class C83 {

	public static void main(String[] args) 
	{
	try(Scanner sc=new Scanner(System.in);)
	{
	String str;
	int i,j=0;
	System.out.println("Enter a string => ");
	str=sc.nextLine();
	char arr[]=new char [str.length()];
	for(i=0;i<str.length();i++)
	{
	if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)==' ')
	{
	arr[j]=str.charAt(i);
	j++;
	}
	}
	System.out.println("After removing all consonants => ");
	for(i=0;i<arr.length;i++)
	{
	System.out.print(arr[i]);
	}
	sc.close();
	}
}
}
