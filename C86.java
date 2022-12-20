package practice;
import java.util.Scanner;
class Student
{
String name;
int roll_no;
void setdata(String n,int rn)
{
this.name=n;
this.roll_no=rn;
}
void getdata()
{
System.out.println("Name is -> "+name);
System.out.println("Roll number is -> "+roll_no);
}
}
public class C86 
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter name -> ");
	String name = sc.nextLine();
	System.out.println("Enter roll number -> ");
	int roll=sc.nextInt();
	Student std=new Student();
	std.setdata(name,roll);
	std.getdata();
	sc.close();
	}
}
