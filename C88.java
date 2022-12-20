package practice;
import java.util.Scanner;
class Triangle
{
	int s1,s2,s3;
	void setdata(int s1,int s2,int s3)
	{
	this.s1=s1;
	this.s2=s2;
	this.s3=s3;
	}
	double getarea()
	{
	double sp=(s1+s2+s3)/2;
	double area=Math.sqrt(sp*(sp-s1)*(sp-s2)*(sp-s3));
	return area;
	}
	int getperimeter()
	{
	return s1+s2+s3;
	}
}
public class C88 
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	int s1,s2,s3;
	Triangle tr=new Triangle();
	System.out.println("Enter the length of first side of the triangle => ");
	s1=sc.nextInt();
	System.out.println("Enter the length of second side of the triangle => ");
	s2=sc.nextInt();
	System.out.println("Enter the length of third side of the triangle => ");
	s3=sc.nextInt();
	tr.setdata(s1,s2,s3);	
	System.out.println("Area of the triangle => "+tr.getarea());
	System.out.println("Perimeter of the triangle => "+tr.getperimeter());	
	sc.close();
	}
}
