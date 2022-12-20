package practice;
class CA
{
	static void method()
	{
		System.out.println("Parent");
	}
}
class CB extends CA
{
	static void method()
	{
		System.out.println("Child");
	}
}
public class C114 
{
	public static void main(String[] args) 
	{
		CA.method();
		//CA B=new CB();
		//B.method();
		CB.method();
	}
}
