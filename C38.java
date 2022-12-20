package practice;
import java.util.Scanner;
public class C38 {
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	int l,b;
	System.out.println("Enter length => ");
	l=sc.nextInt();
	System.out.println("Enter breadth => ");
	b=sc.nextInt();
	if(l==b)
		System.out.println("Its a Square.");
	else System.out.println("Its a Rectangle.");
	sc.close();
	}

}
