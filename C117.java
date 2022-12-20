package practice;
abstract class banks
{
	abstract void getBalance(int num);
}
class Banksa extends banks
{
	void getBalance(int bal)
	{
		System.out.println("Amount in bank A-> $"+bal);	
	}
}
class Banksb extends banks
{
	void getBalance(int bal)
	{
		System.out.println("Amount in bank B-> $"+bal);	
	}
}
class Banksc extends banks
{
	void getBalance(int bal)
	{
		System.out.println("Amount in bank C-> $"+bal);	
	}
}
public class C117 
{
	public static void main(String[] args) 
	{
	Banksa ba=new Banksa();
	ba.getBalance(100);
	Banksb bb=new Banksb();
	bb.getBalance(150);
	Banksc bc=new Banksc();
	bc.getBalance(200);
	}
}
