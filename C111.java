package practice;
class Degree
{
	void getdegree()
	{
	System.out.println("I got a degree.");	
	}
}
class udergraduate extends Degree
{
	void getdegree()
	{
		System.out.println("I am an Undergraduate.");
	}
}
class postgraduate extends Degree
{
	void getdegree()
	{
		System.out.println("I am a Postgraduate.");
	}
}
public class C111 
{
	public static void main(String[] args) 
	{
	udergraduate ud=new udergraduate();
	ud.getdegree();
	postgraduate pd=new postgraduate();
	pd.getdegree();
	}
}
