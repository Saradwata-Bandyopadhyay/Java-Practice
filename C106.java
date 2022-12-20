package practice;
import java.io.*;
class Student2
{
String name;
Student2(String n)
{name=n;}
Student2()
{name="Unknown";}
void getdata()
{
System.out.println("Name -> "+name);
}
}
public class C106 
{
	public static void main(String[] args) throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String str;
	System.out.println("Enter student name -> ");
	str=br.readLine();
	Student2 st =new Student2(str);
	Student2 st1 =new Student2();
	st.getdata();
	st1.getdata();
	}
}
