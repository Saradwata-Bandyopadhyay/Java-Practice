package practice;
import java.io.*;
class customer
{
	String name;
	String dob;
	String pancard;
	String address;
	long aadhar;
	customer(String n,String d,String p,String add,long a)
	{
	name=n;
	dob=d;
	pancard=p;
	aadhar=a;
	address=add;
	}
	void printdata()
	{
		System.out.println("Name -> "+name);
		System.out.println("DOB -> "+dob);
		System.out.println("Pan number -> "+pancard);
		System.out.println("Aadhaar number -> "+aadhar);
		System.out.println("Address -> "+address);
	}
}
class account
{
	String acn;
	String branch;
	account(String a,String b)
	{
		acn=a;
		branch=b;
	}
	void printdata()
	{
		System.out.println("Account number -> "+acn);
		System.out.println("Branch -> "+branch);
	}
}
class RBI
{
	
}
class sbi extends RBI
{
	
}
public class C115 
{
	public static void main(String[] args) throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String name,dob,pan,acn,branch,add;
	long aadhar;
	System.out.println("Enter Name -> ");
	name=br.readLine();
	System.out.println("Enter DOB -> ");
	dob=br.readLine();
	System.out.println("Enter Pan Card -> ");
	pan=br.readLine();
	System.out.println("Enter Aadhaar -> ");
	aadhar=Long.parseLong(br.readLine());
	System.out.println("Enter Address -> ");
	add=br.readLine();
	customer c=new customer(name,dob,pan,add,aadhar);
	System.out.println("Enter Account number -> ");
	acn=br.readLine();
	System.out.println("Enter Branch -> ");
	branch=br.readLine();
	account acc=new account(acn,branch);
	c.printdata();
	acc.printdata();
	}
}
