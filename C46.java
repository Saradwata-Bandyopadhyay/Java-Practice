package practice;
import java.util.Scanner;
public class C46 {
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	double p,ch,ca;
	char reply;
	System.out.println("Enter number of classes held => ");
	ch=sc.nextInt();
	System.out.println("Enter number of classes attended => ");
	ca=sc.nextInt();
	p=(ca/ch)*100;
	System.out.println("Percentage of classes attented => "+p);
	if(p>=75)
		System.out.println("You are eligible to sit for the exam.");
	else 
	{
	System.out.println("Do you have medical cause => ");
	reply=sc.next().charAt(0);
	if(reply=='y'||reply=='Y')
		System.out.println("You are eligible to sit for the exam.");
	else System.out.println("You are not eligible to sit for the exam.");
	}
	sc.close();
	}
}
