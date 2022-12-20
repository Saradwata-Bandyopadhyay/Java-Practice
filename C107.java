package practice;
class PrintNumber
{
void printn(int n)
{
System.out.println("Integer");	
}
void printn(char n)
{
System.out.println("Character");	
}
void printn(double n)
{
System.out.println("Double");
}
void printn(long n)
{
System.out.println("Double");
}
void printn(float n)
{
System.out.println("Double");
}
void printn(String n)
{
System.out.println("String");
}
}
public class C107 {
	public static void main(String[] args) 
	{
	PrintNumber pn=new PrintNumber();
	var v=12;
	pn.printn(v);
	}

}
