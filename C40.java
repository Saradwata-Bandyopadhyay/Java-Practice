package practice;
import java.util.Scanner;
public class C40 
{
	public static void main(String[] args) 
	{
	Scanner sc= new Scanner(System.in);
	int unit;
	double value,d;
	System.out.println("Enter the quantity of purchase => ");
	unit=sc.nextInt();
	value=100*unit;
	d=value-(100*unit)*0.1;
	if(unit>=1000)
	System.out.println("Total cost with discount => "+d);
	else System.out.println("Total cost without discount => "+value);
	sc.close();
	}

}
