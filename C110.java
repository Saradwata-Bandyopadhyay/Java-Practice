package practice;
import java.io.*;
class student3
{
	String name;
	int age;
	String address;
	student3()
	{
	name="unknown";
	age=0;
	address="not available";
	}
	void setinfo(String n,int a)
	{
	name=n;
	age=a;
	}
	void setinfo(String n,int a,String add)
	{
	name=n;
	age=a;
	address=add;
	}
	void getdata()
	{
		System.out.println("Name -> "+name+" age -> "+age+" Address -> "+address);
	}
}
public class C110 
{
	public static void main(String[] args) throws IOException
	{
	int i;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	student3 arr[]=new student3[10];
	for(i=0;i<10;i++)
	{
	System.out.println("Enter name -> ");
	String n=br.readLine();
	System.out.println("Enter age -> ");
	int a=Integer.parseInt(br.readLine());
	System.out.println("Enter address -> ");
	String ad=br.readLine();
	arr[i]=new student3();
	arr[i].setinfo(n,a,ad);
	}
	for(i=0;i<10;i++)
	{
	arr[i].getdata();
	}
	}
	}
