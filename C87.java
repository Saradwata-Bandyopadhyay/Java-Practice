package practice;
import java.util.Scanner;
class Student1
{
int roll;
String name,addr;
long phn;
void setdata(String n,int rollnumber,String address,Long ph)
{
this.name=n;
this.roll=rollnumber;
this.phn=ph;
this.addr=address;
}
void printdata()
{
System.out.println("Name => "+name);
System.out.println("Roll number => "+roll);
System.out.println("Phone number => "+phn);
System.out.println("Address => "+addr);
}
}
public class C87 
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	Student1 s1=new Student1();
	Student1 s2=new Student1();
	String ad,na;
	int ro;
	long ph;
	System.out.println("Enter Name => ");
	na=sc.nextLine();
	System.out.println("Enter Roll number => ");
	ro=sc.nextInt();
	System.out.println("Enter Phone number => ");
	ph=sc.nextLong();
	sc.nextLine();
	System.out.println("Enter Address => ");
	ad=sc.nextLine();
	s1.setdata(na,ro,ad,ph);
	s1.printdata();
	System.out.println("Enter Name => ");
	na=sc.nextLine();
	System.out.println("Enter Roll number => ");
	ro=sc.nextInt();
	System.out.println("Enter Phone number => ");
	ph=sc.nextLong();
	sc.nextLine();
	System.out.println("Enter Address => ");
	ad=sc.nextLine();
	s2.setdata(na,ro,ad,ph);
	s2.printdata();
	sc.close();
	}
}
