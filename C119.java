package practice;
abstract class AC119
{
	AC119()
	{
		System.out.println("This is a constructor of abstract class.");
	}
	abstract void amethod();
	void bmethod()
	{
		System.out.println("This is a normal method of abstract class.");
	}
}
class subclass extends AC119
{
	void amethod()
	{
		System.out.println("This is abstract method.");
	}
}
public class C119 
{
	public static void main(String[] args) 
	{
	subclass sc=new subclass();
	sc.amethod();
	sc.bmethod();
	}
}
