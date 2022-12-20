package practice;
import java.util.Scanner;
class Rectangle
{
	int length;
	int breadth;
	Rectangle(int l,int b)
	{
	length=l;
	breadth=b;
	}
	int area()
	{
		return length*breadth;
	}
}
public class C89 {
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	int length,breadth;
	System.out.println("Enter length => ");
	length=sc.nextInt();
	System.out.println("Enter breadth => ");
	breadth=sc.nextInt();
	Rectangle rt1=new Rectangle(length,breadth);
	System.out.println("Area of the rectangle => "+rt1.area());
	System.out.println("Enter length => ");
	length=sc.nextInt();
	System.out.println("Enter breadth => ");
	breadth=sc.nextInt();
	Rectangle rt2=new Rectangle(length,breadth);
	System.out.println("Area of the rectangle => "+rt2.area());
	sc.close();
	}

}
