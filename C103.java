package practice;
import java.io.*;
class Rectangle1
{
int length;
int breadth;
Rectangle1(int l,int b)
{
	length=l;
	breadth=b;
}
int area ()
{
return length*breadth;
}
int perimeter()
{
return 2*(length+breadth);	
}
}
class Square extends Rectangle1
{
Square(int s) 
{
super(s,s);
}
}
public class C103 
{
	public static void main(String[] args) throws IOException
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int l,b,s;
	System.out.println("Enter length -> ");
	l=Integer.parseInt(br.readLine());
	System.out.println("Enter breadth -> ");
	b=Integer.parseInt(br.readLine());
	Rectangle1 r=new Rectangle1(l,b);
	System.out.println("Area -> "+r.area());
	System.out.println("Perimeter -> "+r.perimeter());
	System.out.println("Enter Side -> ");
	s=Integer.parseInt(br.readLine());
	Square sq=new Square(s);
	System.out.println("Area -> "+sq.area());
	System.out.println("Perimeter -> "+sq.perimeter());
	}
}
