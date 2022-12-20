package practice;
import java.util.Scanner;
public class C59 {
	static void checker(int num)
	{
	if(num>=18)
		System.out.println("You are eligible to vote.");
	else System.out.println("You are not eligible to vote.");
	}
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	int num;
	System.out.println("Enter your age => ");
	num=sc.nextInt();
	checker(num);
	sc.close();
	}

}
