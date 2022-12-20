package practice;
import java.util.Scanner;
class Employee
{
int yoj;
String name;
String address;
Employee(String n,int y,String a)
{
name=n;
yoj=y;
address=a;
}
void printdata()
{
System.out.println(name+"        "+yoj+"        "+address);
}
}
public class C93 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String name,address;
		int year;
		System.out.println("Enter Name => ");
		name=sc.nextLine();
		System.out.println("Enter Year of joining => ");
		year=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Address => ");
		address=sc.nextLine();
		Employee emp1=new Employee(name,year,address);
		System.out.println("Name"+"        "+"Year of joining"+"        "+"Address");
		emp1.printdata();
		System.out.println("Enter Name => ");
		name=sc.nextLine();
		System.out.println("Enter Year of joining => ");
		year=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Address => ");
		address=sc.nextLine();
		Employee emp2=new Employee(name,year,address);
		emp2.printdata();
		System.out.println("Enter Name => ");
		name=sc.nextLine();
		System.out.println("Enter Year of joining => ");
		year=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Address => ");
		address=sc.nextLine();
		Employee emp3=new Employee(name,year,address);
		emp3.printdata();
		sc.close();
	}
}