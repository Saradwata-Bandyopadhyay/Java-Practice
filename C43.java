package practice;
import java.util.Scanner;
public class C43 {
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	int a1,a2,a3;
	System.out.println("Enter age of first person => ");
	a1=sc.nextInt();
	System.out.println("Enter age of second person => ");
	a2=sc.nextInt();
	System.out.println("Enter age of third person => ");
	a3=sc.nextInt();
	if(a1>a2 && a1>a3)
		System.out.println(a1+" is oldest");
	else if(a2>a1 && a2>a3)
		System.out.println(a2+" is oldest");
	else System.out.println(a3+" is oldest");
	if(a1<a2 && a1<a3)
		System.out.println(a1+" is youngest");
	else if(a2<a1 && a2<a3)
		System.out.println(a2+" is youngest");
	else System.out.println(a3+" is youngest");
	sc.close();
	}

}
