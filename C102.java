package practice;
import java.io.*;
class member
{
String name;
int age;
long pnumber;
String address;
double salary;
void printsalary()
{
System.out.println("Salary is "+salary);
}
}
class Employee1 extends member
{
	String specialization;
	void getdata()
	{
	System.out.println("Name -> "+name);
	System.out.println("Age -> "+age);
	System.out.println("Phone number -> "+pnumber);
	System.out.println("Address -> "+address);
	System.out.println("Salary -> "+salary);
	System.out.println("Specialization -> "+specialization);
	}
}
class Manager1 extends member
{
	String department;
	void getdata()
	{
	System.out.println("Name -> "+name);
	System.out.println("Age -> "+age);
	System.out.println("Phone number -> "+pnumber);
	System.out.println("Address -> "+address);
	System.out.println("Salary -> "+salary);
	System.out.println("Specialization -> "+department);
	}
}
public class C102 
{
	public static void main(String[] args) throws IOException 
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Employee1 emp=new Employee1();
	Manager1 mn=new Manager1();
	System.out.println("Taking data for employee class");
	System.out.println("Enter Name -> ");
	emp.name=br.readLine();
	System.out.println("Enter Age -> ");
	emp.age=Integer.parseInt(br.readLine());
	System.out.println("Enter Phone number -> ");
	emp.pnumber=Long.parseLong(br.readLine());
	System.out.println("Enter Address -> ");
	emp.address=br.readLine();
	System.out.println("Enter Salary -> ");
	emp.salary=Double.parseDouble(br.readLine());
	System.out.println("Enter specialization -> ");
	emp.specialization=br.readLine();
	
	System.out.println("Taking data for manager class");
	System.out.println("Enter Name -> ");
	mn.name=br.readLine();
	System.out.println("Enter Age -> ");
	mn.age=Integer.parseInt(br.readLine());
	System.out.println("Enter Phone number -> ");
	mn.pnumber=Long.parseLong(br.readLine());
	System.out.println("Enter Address -> ");
	mn.address=br.readLine();
	System.out.println("Enter Salary -> ");
	mn.salary=Double.parseDouble(br.readLine());
	System.out.println("Enter Department -> ");
	mn.department=br.readLine();
	
	emp.getdata();
	mn.getdata();
	}

}
