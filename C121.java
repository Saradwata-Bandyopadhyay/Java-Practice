package practice;
import java.util.Scanner;
abstract class shapesC121
{
	abstract void rectanglearea(int p1,int p2);
	abstract void squarearea(int p1);
	abstract void circlearea(int p1);
}
class AreaC121 extends shapesC121
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
public class C121 
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	int length,breadth,side,radius;
	AreaC121 a=new AreaC121();
	System.out.println("Enter length of the rectangle -> ");
	length=sc.nextInt();
	System.out.println("Enter breadth of the rectangle -> ");
	breadth=sc.nextInt();
	a.rectanglearea(length,breadth);
	System.out.println("Enter side of the square -> ");
	side=sc.nextInt();
	a.squarearea(side);
	System.out.println("Enter radius of the circle -> ");
	radius=sc.nextInt();
	a.circlearea(radius);
	sc.close();
	}
}
