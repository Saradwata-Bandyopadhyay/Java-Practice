package practice;
class Shape
{
void method1()
{
System.out.println("This is a shape.");
}
}
class Rectangle3 extends Shape
{
	void method2()
	{
	System.out.println("This is a Rectangular shape.");
	}	
}
class Circle extends Shape
{
	void method3()
	{
	System.out.println("This is a Circular shape.");
	}
}
class Square2 extends Rectangle3
{
	void method4()
	{
	System.out.println("Square is a Rectangle.");
	}
}
public class C105 
{
	public static void main(String[] args) 
	{
	Square2 sq=new Square2();
	sq.method1();
	sq.method2();
	sq.method4();
	}
}
