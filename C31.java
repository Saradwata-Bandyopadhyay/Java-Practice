package practice;
import java.util.Scanner;
public class C31 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	double l,b;
	int area;
	System.out.println("Enter Length of the rectangle => ");
	l=sc.nextDouble();
	System.out.println("Enter Breadth of the rectangle => ");
	b=sc.nextDouble();
	area=(int)(l*b);
	System.out.println("Area of the Rectangle is => "+area);
	sc.close();
	}

}
