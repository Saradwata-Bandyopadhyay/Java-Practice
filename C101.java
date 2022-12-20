package practice;
import java.util.Scanner;
class cl1
{
void method1()
{
System.out.println("This is parent class.");
}
}
class cl2 extends cl1
{
void method2()
{
System.out.println("This is child class.");
}	
}
public class C101
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
cl1 c1=new cl1();
c1.method1();
cl2 c2=new cl2();
c2.method2();
c2.method1();
sc.close();
}
}
