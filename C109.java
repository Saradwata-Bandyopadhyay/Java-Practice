package practice;
import java.io.*;
class shapes
{
void area(int l,int b)
{
System.out.println("Area of Rectangle -> "+(l*b));
}
void area(int s)
{
System.out.println("Area of Square -> "+(s*s));
}
}
public class C109 
{
	public static void main(String[] args) throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int l,b,s;
	System.out.println("Enter Length ->");
	l=Integer.parseInt(br.readLine());
	System.out.println("Enter Breadth ->");
	b=Integer.parseInt(br.readLine());
	shapes sh=new shapes();
	System.out.println("Enter Side ->");
	s=Integer.parseInt(br.readLine());
	sh.area(l,b);
	sh.area(s);
	}
}
