package practice;
import java.util.Scanner;
abstract class marks
{
	abstract double getPercentage();
}
class A118 extends marks
{
	double s1;
	double s2;
	double s3;
	A118(double s1,double s2,double s3)
	{
		this.s1=s1;
		this.s2=s2;
		this.s3=s3;
	}
	double getPercentage()
	{
		double percentage;
		percentage=((s1+s2+s3)/300)*100;
		return percentage;
	}
}
class B118 extends marks
{
	double s1;
	double s2;
	double s3;
	double s4;
	B118(double s1,double s2,double s3,double s4)
	{
		this.s1=s1;
		this.s2=s2;
		this.s3=s3;
		this.s4=s4;
	}
	double getPercentage()
	{
		double percentage;
		percentage=((s1+s2+s3+s4)/400)*100;
		return percentage;
	}
}
public class C118 
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	double m1,m2,m3,m4;
	System.out.println("Enter Marks of Student A");
	System.out.println("Enter Marks of Subject 1 -> ");
	m1=sc.nextDouble();
	System.out.println("Enter Marks of Subject 2 -> ");
	m2=sc.nextDouble();
	System.out.println("Enter Marks of Subject 3 -> ");
	m3=sc.nextDouble();
	A118 a=new A118(m1,m2,m3);
	System.out.println("Percentage obtained -> "+a.getPercentage());
	System.out.println("Enter Marks of Student B");
	System.out.println("Enter Marks of Subject 1 -> ");
	m1=sc.nextDouble();
	System.out.println("Enter Marks of Subject 2 -> ");
	m2=sc.nextDouble();
	System.out.println("Enter Marks of Subject 3 -> ");
	m3=sc.nextDouble();
	System.out.println("Enter Marks of Subject 4 -> ");
	m4=sc.nextDouble();
	B118 b=new B118(m1,m2,m3,m4);
	System.out.println("Percentage obtained -> "+b.getPercentage());
	sc.close();
	}
}
