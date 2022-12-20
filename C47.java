package practice;
import java.util.Scanner;
public class C47 {
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	int x,y,z;
	x=2;
	y=5;
	z=0;
	System.out.println("x==2 is "+(x==2));
	System.out.println("x!=5 is "+(x!=5));
	System.out.println("x!=5 && y>=5 is "+(x!=5 && y>=5));
	System.out.println("z!=0 || x==2 is "+(z!=0 || x==2));
	System.out.println("!(y<10) is "+(!(y<10)));
	sc.close();
	}

}