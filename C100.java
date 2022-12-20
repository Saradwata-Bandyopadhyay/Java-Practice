package practice;
import java.util.Scanner;
class class1
{
void method1()
{
System.out.println("This is parent class.");
}
}
class class2 extends class1
{
void method2()
{
System.out.println("This is child class.");
}	
}
public class C100 
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
class1 cl1=new class1();
cl1.method1();
class2 cl2=new class2();
cl2.method2();
cl2.method1();
sc.close();
}
}
