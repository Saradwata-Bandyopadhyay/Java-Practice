package practice;
import java.util.Scanner;
public class C32 {
	public static void main(String[] args) 
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Name => ");
	String name = sc.nextLine();
	System.out.println("Enter Field of Interest => ");
	String interest = sc.nextLine();
	System.out.println("Enter roll number => ");
	int roll = sc.nextInt();
	System.out.println("Hey, my name is "+name+" and my roll number is "+roll+". My field of interest are "+interest);
	sc.close();
	}

}
