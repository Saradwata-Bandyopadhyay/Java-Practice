package practice;
import java.util.Scanner;
class Complex
{
int real1,imag1,real2,imag2;

Complex(int r,int i,int r2,int i2)
{
real1=r;
imag1=i;
real2=r2;
imag2=i2;
}
void cadd ()
{
	if(imag1+imag2>0)
	System.out.println("Addition -> "+(real1+real2)+'+'+(imag1+imag2)+'i');
	else System.out.println("Addition -> "+(real1+real2)+(imag1+imag2)+'i');
}
void csub ()
{
	if(imag1-imag2>0)
	System.out.println("Subtraction -> "+(real1-real2)+'+'+(imag1-imag2)+'i');
	else System.out.println("Subtraction -> "+(real1-real2)+(imag1-imag2)+'i');
}
void cmul ()
{
	System.out.println("Multiplication -> "+(real1*real2-imag1*imag2)+'+'+(real1*imag2+imag1*real2)+'i');
}
}
public class C92 
{
	public static void main(String[] args) 
	{
Scanner sc=new Scanner(System.in);
int r,i,r2,i2;
System.out.println("Enter Real value of first number => ");
r=sc.nextInt();
System.out.println("Enter Imaginary value of first number => ");
i=sc.nextInt();
System.out.println("Enter Real value of second number => ");
r2=sc.nextInt();
System.out.println("Enter Imaginary value of second number => ");
i2=sc.nextInt();
Complex c=new Complex(r,i,r2,i2);
c.cadd();
c.csub();
c.cmul();
sc.close();
	}
}
