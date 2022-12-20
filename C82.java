package practice;
import java.util.*;
public class C82 {

	public static void main(String[] args) 
	{
	try(Scanner sc=new Scanner(System.in);)
	{
	String str;
	int i,vc=0,c=0,n=0,schar=0;
	System.out.println("Enter a string to count => ");
	str=sc.nextLine();
	for(i=0;i<str.length();i++)
	{
	if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
	vc++;
	else if(Character.isDigit(str.charAt(i))==true)
	n++;
	else if(Character.isWhitespace(str.charAt(i))==true)
	schar++;
	else c++;
	}
	System.out.println("Vowel count => "+vc);
	System.out.println("Consonant count => "+c);
	System.out.println("Space count => "+schar);
	System.out.println("Digit count => "+n);
	sc.close();
	}
	}
}
