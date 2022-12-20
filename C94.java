package practice;
import java.util.Scanner;
class AddDistance
{
double feet,inch;
AddDistance(double f,double i)
{
feet=f;
inch=i;
}
double add()
{
double d=(feet*12)+inch;
return d;
}
}
public class C94 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int feet,inch;
		double d;
		System.out.println("Enter length in feet => ");
		feet=sc.nextInt();
		System.out.println("Enter length in inch => ");
		inch=sc.nextInt();
		AddDistance ad=new AddDistance(feet,inch);
		d=ad.add();
		System.out.println("Total length => "+d);
		sc.close();
	}

}
