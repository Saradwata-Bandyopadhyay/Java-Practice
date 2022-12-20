package practice;
import java.util.Scanner;
public class C79 {
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	String str;
	System.out.println("Enter a string => ");
	str=sc.nextLine();
	if(str.indexOf("orange")>0)
		System.out.println("Text found !!!");
	else System.out.println("Text not found !!!");
	sc.close();
	}

}
