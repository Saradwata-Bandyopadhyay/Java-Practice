package practice;
import java.util.Scanner;
class stdt
{
double height;
void getdata(double h)
{
height=h;
}
}
public class C97 
{
	public static void main(String[] args) 
	{
	try(Scanner sc=new Scanner(System.in);)
	{
	int n,i;
	double height,avg,sum=0;
	System.out.println("Enter number of students => ");
	n=sc.nextInt();
	stdt arr[]=new stdt[n];
	for(i=0;i<n;i++)
	{
	arr[i]=new stdt();
	System.out.println("Enter height of the student => ");
	height=sc.nextDouble();
	arr[i].getdata(height);
	sum=sum+height;
	}
	avg=sum/n;
	System.out.println("Average height of the class => "+avg);
	sc.close();
	}
	}
}