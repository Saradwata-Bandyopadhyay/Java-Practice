package practice;
import java.util.Scanner;
public class C81 {

	public static void main(String[] args) 
	{
	try(Scanner sc=new Scanner(System.in);)
	{
	String str;
	int pos1,pos2,i;
	System.out.println("Enter a string => ");
	str=sc.nextLine();
	pos1=str.indexOf(' ');
	pos2=str.lastIndexOf(' ');
	System.out.print(str.charAt(0)+"."+str.charAt(pos1+1)+".");
	for(i=pos2+1;i<str.length();i++)
	{
	System.out.print(str.charAt(i));
	}
	sc.close();
	}
	}
}
