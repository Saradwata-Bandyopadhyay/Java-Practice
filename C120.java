package practice;
abstract class Animals
{
	abstract void cats();
	abstract void dogs();
}
class Cats extends Animals
{
	void cats()
	{
		System.out.println("Cats meow");
	}
	void dogs()
	{
		
	}
}
class Dogs extends Animals
{
	void dogs()
	{
		System.out.println("Dogs bark");
	}
	void cats()
	{
		
	}
}
public class C120 
{
	public static void main(String[] args) 
	{
	Dogs d=new Dogs();
	d.dogs();
	Cats c=new Cats();
	c.cats();
	}
}
