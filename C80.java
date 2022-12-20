package practice;
import java.util.Scanner;
public class C80 {

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	String str;
	System.out.println("Enter a string => ");
	str=sc.nextLine();
	System.out.println("First occurence of 'o' is "+(str.indexOf('o')+1));
	System.out.println("Last occurence of 'o' is "+(str.lastIndexOf('o')+1));
	System.out.println("First occurence of ',' is "+(str.indexOf(',')+1));
	System.out.println("Last occurence of ',' is "+(str.lastIndexOf(',')+1));
	sc.close();
	}

}
