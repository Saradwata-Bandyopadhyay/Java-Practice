package practice;
import java.util.Scanner;
public class C48 {
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	char ch;
	System.out.println("Enter a character to check its case => ");
	ch=sc.next().charAt(0);
	if(ch>=65 && ch<=90)
	System.out.println(ch+" is Uppercase !!!");
	else System.out.println(ch+" is Lowercase !!!");
	sc.close();
	}
}
