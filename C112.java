package practice;
class bank
{
	int balance=0;
	int getbalance()
	{
	return balance;
	}
}
class banka extends bank
{
	int balance=1000;
	int getbalance()
	{
	return balance;
	}
}
class bankb extends bank
{
	int balance=1500;
	int getbalance()
	{
	return balance;
	}
}
class bankc extends bank
{
	int balance=2000;
	int getbalance()
	{
	return balance;
	}
}
public class C112 
{
	public static void main(String[] args) 
	{
	banka ba=new banka();
	System.out.println("Balance in bank A -> $"+ba.getbalance());
	bankb bb=new bankb();
	System.out.println("Balance in bank B -> $"+bb.getbalance());
	bankc bc=new bankc();
	System.out.println("Balance in bank C -> $"+bc.getbalance());
}
}