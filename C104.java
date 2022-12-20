package practice;
import java.io.*;
class Rectangle2
{
int length;
int breadth;
Rectangle2(int l,int b)
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
class Square1 extends Rectangle2
{
Square1(int s) 
{
super(s,s);
}
}
public class C104
{
	public static void main(String[] args) throws IOException
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int l,b,i,s;
	System.out.println("Enter length -> ");
	l=Integer.parseInt(br.readLine());
	System.out.println("Enter breadth -> ");
	b=Integer.parseInt(br.readLine());
	Rectangle2 r=new Rectangle2(l,b);
	System.out.println("Area -> "+r.area());
	System.out.println("Perimeter -> "+r.perimeter());
	Square1 sqa[]=new Square1[10];
	for(i=0;i<10;i++)
	{
	System.out.println("Enter Side -> ");
	s=Integer.parseInt(br.readLine());
	sqa[i]=new Square1(s);
	System.out.println("Area -> "+sqa[i].area());
	System.out.println("Perimeter -> "+sqa[i].perimeter());
	}
	}
}
