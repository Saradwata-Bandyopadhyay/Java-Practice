package practice;
abstract class parent
{
	abstract void message();
}
class s1 extends parent
{
void message()
{
	System.out.println("This is my first class");
}
}
class s2 extends parent
{
void message()
{
	System.out.println("This is my second class");
}
}
public class C116 
{
	public static void main(String[] args) 
	{
	s1 s=new s1();
	s2 s2=new s2();
	s.message();
	s2.message();
	}
}
