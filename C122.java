package practice;
import java.util.Scanner;
abstract class shapesC122
{
	abstract void rectanglearea(int p1,int p2);
	abstract void squarearea(int p1);
	abstract void circlearea(int p1);
}
class AreaC122 extends shapesC122
{
	void rectanglearea(int length,int breadth)
	{
		System.out.println("Area of the rectangle -> "+(length*breadth));
	}
	void squarearea(int side)
	{
		System.out.println("Area of the square -> "+(side*side));
	}
	void circlearea(int radius)
	{
		System.out.println("Area of the circle -> "+(3.1428*radius*radius));
	}
}
public class C122
{
	public static void main(String[] args) 
	{
	try(Scanner sc=new Scanner(System.in);)
	{
	int length,breadth,side,radius,i;
	AreaC122 a=new AreaC122();
	for(i=0;i<4;i++)
	{
	System.out.println("Enter length of the rectangle -> ");
	length=sc.nextInt();
	System.out.println("Enter breadth of the rectangle -> ");
	breadth=sc.nextInt();
	a.rectanglearea(length,breadth);
	}
	for(i=0;i<4;i++)
	{
	System.out.println("Enter side of the square -> ");
	side=sc.nextInt();
	a.squarearea(side);
	}
	for(i=0;i<4;i++)
	{
	System.out.println("Enter radius of the circle -> ");
	radius=sc.nextInt();
	a.circlearea(radius);
	}
	sc.close();
	}
}
}
