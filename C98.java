package practice;
import java.io.*;
class BankAccount
{
	String name,address,type,acn;
	double balance;
	static int tc,count=0,i=0;
	String pattern="BA100";
	void setdata(String n,String a,String t,double b)
	{
	this.name=n;
	this.address=a;
	this.type=t;
	this.balance=b;
	this.acn=genuan();
	}
	String genuan()
	{
	i++;
	return pattern+(i-1);
	}
	void getdata()
	{
	System.out.println("Account number -> "+this.acn+" Name -> "+this.name+" Address -> "+this.address+" Type -> "+this.type+" Balance -> "+this.balance);
	}
	void deposit(double amt)
	{
	balance=balance+amt;
	}
	void withdraw(double amt)
	{
	balance=balance-amt;
	}
	void addup(String addr)
	{
	address=addr;
	}
	static int pf(BankAccount[] arr,int n) throws IOException
	{
	int i,pos=-1;
	System.out.println("Enter Account number => ");
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String acn=br.readLine();
	for(i=0;i<n;i++)
		{
		if(acn.equals(arr[i].acn))
			pos=i;
		}
	return pos;
	}
}
public class C98 
{
	public static void main(String[] args) throws IOException 
	{
	int n,i,j=1,choice,pos;
	String nm,a,t,na;
	double b,amt;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter number of accounts to be created -> ");
	n=Integer.parseInt(br.readLine());
	BankAccount arr[]=new BankAccount[n];
	for(i=0;i<n;i++)
	{
	arr[i]=new BankAccount();
	System.out.println("Enter Name -> ");
	nm=br.readLine();
	System.out.println("Enter Address -> ");
	a=br.readLine();
	System.out.println("Enter Type of account -> ");
	t=br.readLine();
	System.out.println("Enter Balance -> ");
	b=Double.parseDouble(br.readLine());
	arr[i].setdata(nm,a,t,b);
	System.out.println("Account created successfully !!!");
	}
	while(j!=0)
	{
	System.out.println("Enter 1 to get account details");
	System.out.println("Enter 2 to deposit money");
	System.out.println("Enter 3 to withdraw money");
	System.out.println("Enter 4 to change address");
	System.out.println("Enter 5 to exit");
	System.out.println("Enter your choice");
	choice=Integer.parseInt(br.readLine());
	switch(choice)
	{
	case 1:
		pos=BankAccount.pf(arr,n);
		if(pos<0)
			System.out.println("Account not found !!!");
		else 
		{	
		arr[pos].getdata();
		}
		break;
	case 2:
		System.out.println("Enter amount to be deposited => ");
		amt=Double.parseDouble(br.readLine());
		pos=BankAccount.pf(arr,n);
		if(pos<0)
			System.out.println("Account not found !!!");
		else
		{
		arr[pos].deposit(amt);
		System.out.println("Amount deposited successfully !!!");
		}
		break;
	case 3:
		pos=BankAccount.pf(arr,n);
		System.out.println("Enter amount to be withdrawn => ");
		amt=Double.parseDouble(br.readLine());
		if(pos<0)
			System.out.println("Account not found !!!");
		else 
		{
		arr[pos].withdraw(amt);
		System.out.println("Amount withdrawn successfully !!!");
		}
		break;
	case 4:
		System.out.println("Enter new address => ");
		na=br.readLine();
		pos=BankAccount.pf(arr,n);
		if(pos<0)
			System.out.println("Account not found !!!");
		else 
		{
		arr[pos].addup(na);
		System.out.println("Address updated successfully !!!");
		}
		break;
	case 5:j=0;
		break;
	default:System.out.println("Invalid choice !!!");
	break;
	}
	}
	}
	}