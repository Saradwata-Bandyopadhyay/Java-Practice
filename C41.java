package practice;
import java.util.Scanner;
public class C41 {
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	int y,b;
	System.out.println("Enter years of service => ");
	y=sc.nextInt();
	System.out.println("Enter base salary => ");
	b=sc.nextInt();
	if(y>5)
		System.out.println("Salary after increment => "+((0.05*b)+b));
	else System.out.println("Salary remains "+b);
	sc.close();
	}
}
