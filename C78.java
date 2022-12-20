package practice;
import java.util.Scanner;
public class C78 {

	public static void main(String[] args) 
	{
	try(Scanner sc=new Scanner(System.in);)
	{
	String str;
	int i,flag=0;
	System.out.println("Enter a word => ");
	str=sc.next();
	for(i=0;i<str.length();i++)
	{
		if(str.charAt(i)=='e')
		{
			System.out.println("Character found !!!");
			flag=1;
		}
	}
	if(flag==0)
	System.out.println("Character not found !!!");
	sc.close();
	}
}
}