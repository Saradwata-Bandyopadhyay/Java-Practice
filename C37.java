package practice;
import java.util.Scanner;
public class C37 {
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	int m1,m2,m3;
	double percent,total;
	System.out.println("Enter marks of first subject => ");
	m1=sc.nextInt();
	System.out.println("Enter marks of second subject => ");
	m2=sc.nextInt();
	System.out.println("Enter marks of third subject => ");
	m3=sc.nextInt();
	total=m1+m2+m3;
	percent=(total/300)*100;
	System.out.println("Total Marks obtained => "+(int)total);
	System.out.println("Total Percentage obtained => "+percent);
	sc.close();
	}

}
