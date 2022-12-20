package practice;
import java.util.Scanner;
public class C62 {
	static void circle(int radius)
	{
	double area,p;
	area=3.14*radius*radius;
	p=2*3.14*radius;
	System.out.println("Area of the circle => "+area);
	System.out.println("Circumference of the circle => "+p);
	}
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	int radius;
	System.out.println("Enter Radius of the circle => ");
	radius=sc.nextInt();
	circle(radius);
	sc.close();
	}

}
