package practice;
import java.util.Scanner;
public class C33 {
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	int side;
	System.out.println("Enter the side of a square => ");
	side=sc.nextInt();
	System.out.println("Area of the square => "+(side*side)+"\nPerimeter => "+(4*side));
	sc.close();
	}

}
