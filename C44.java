package practice;
import java.util.Scanner;
public class C44 {
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	int num;
	System.out.println("Enter a number => ");
	num=sc.nextInt();
	if(num>1)
		System.out.println("Absolute form => "+num);
	else System.out.println("Absolute form => "+(num*-1));
	sc.close();
	}

}
