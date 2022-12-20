package practice;
import java.util.Scanner;
public class C42 
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	int marks;
	System.out.println("Enter marks => ");
	marks=sc.nextInt();
	if(marks>=80)
		System.out.println("Grade obtained => A");
	else if(marks>=60 && marks <80)
		System.out.println("Grade obtained => B");
	else if(marks>=50 && marks <60)
		System.out.println("Grade obtained => C");
	else if(marks>=45 && marks <50)
		System.out.println("Grade obtained => D");
	else if(marks>=25 && marks <45)
		System.out.println("Grade obtained => E");
	else System.out.println("Grade obtained => F");
	sc.close();
	}
}
