package practice;
import java.util.Scanner;
class Area
{
int length,breadth;
void setDim(int l,int b)
{
	this.length=l;
	this.breadth=b;
}
int getArea()
{
	int area;
	area=length*breadth;
	return area;
}
int getPerimeter()
{
	int perimeter;
	perimeter=2*(length+breadth);
	return perimeter;
}
}
public class C85 {
	public static void main(String[] args) 
	{
	int l,b;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter length of the rectangle => ");
	l=sc.nextInt();
	System.out.println("Enter breadth of the rectangle => ");
	b=sc.nextInt();
	Area rectangle=new Area ();
	rectangle.setDim(l,b);
	System.out.println("Area of the rectangle => "+rectangle.getArea());
	System.out.println("Perimeter of the rectangle => "+rectangle.getPerimeter());
	sc.close();
	}
}
