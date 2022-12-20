package practice;
import java.util.Scanner;
class Area1
{
int length;
int breadth;
Area1(int l,int b)
{
length=l;
breadth=b;
}
int returnArea()
{
return length*breadth;
}
}
public class C90 
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	int l,b;
	System.out.println("Enter the length of the rectangle => ");
	l=sc.nextInt();
	System.out.println("Enter the breadth of the rectangle => ");
	b=sc.nextInt();
	Area1 ar=new Area1(l,b);
	System.out.println("Area of the Rectangle => "+ar.returnArea());
	sc.close();
	}
}
