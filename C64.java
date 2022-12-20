package practice;
import java.util.Scanner;
public class C64 {
static void grade(int g)
{
	if(g>=90 && g<=100)
		System.out.println("AA");
	else if(g>=81 && g<=90)
		System.out.println("AB");
	else if(g>=71 && g<=80)
		System.out.println("BB");
	else if(g>=61 && g<=70)
		System.out.println("BC");
	else if(g>=51 && g<=60)
		System.out.println("CD");
	else if(g>=41 && g<=50)
		System.out.println("DD");
	else System.out.println("Fail");
}
	public static void main(String[] args) {
	int marks;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter marks => ");
	marks=sc.nextInt();
	grade(marks);
	sc.close();
	}

}
