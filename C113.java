package practice;
class a
{
int i;
a(int val)
{
	i=val;
}
void printnum()
{
	System.out.println("Value of i is "+i);
}
}
class b extends a
{
int j;
b(int val)
{
super(val);
}
void printnum()
{
	System.out.println("Value of j is "+i);
}	
}
public class C113 
{
	public static void main(String[] args) 
	{
	a c=new a(10);
	c.printnum();
	b d=new b(11);
	d.printnum();
	}
}
