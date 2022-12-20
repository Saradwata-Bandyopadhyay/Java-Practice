package practice;
import java.util.Scanner;
class emp
{
String name;
int salary;
int doj;
void setData(String n,int s,int d)
{
name=n;
salary=s;
doj=d;
}
void getData()
{
System.out.println("Name -> "+name+" Salary -> "+salary+" Date of Joining -> "+doj);
}
}
public class C95 
{
	public static void main(String[] args) 
	{
	try(Scanner sc=new Scanner(System.in);)
	{
	int i,doj,sal;
	emp[] e=new emp[10];
	String name;
	System.out.println("Enter 10 employee details => ");
	for(i=0;i<10;i++)
	{
	e[i]=new emp();
	System.out.println("Enter Name => ");
	name=sc.nextLine();
	System.out.println("Enter Date of joining => ");
	doj=sc.nextInt();
	System.out.println("Enter Salary => ");
	sal=sc.nextInt();
	sc.nextLine();
	e[i].setData(name,sal,doj);
	}
	System.out.println("Entered employee details => ");
	for(i=0;i<10;i++)
	{
	e[i].getData();
	}
	sc.close();
	}
}
}