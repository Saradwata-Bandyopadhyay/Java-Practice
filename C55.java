package practice;
import java.util.Scanner;
public class C55 {
	public static void main(String[] args) {
	try (Scanner sc = new Scanner(System.in)) {
		int num;
		double avg,pro=1,count=0,sum=0;
		char br;
		while(true)
		{
		System.out.println("Enter a number => ");
		num=sc.nextInt();
		count++;
		pro=pro*num;
		sum=sum+num;
		avg=(double)(sum/count);
		System.out.println("Enter q to quit => ");
		br=sc.next().charAt(0);
		if(br=='q'||br=='Q')
		{
			System.out.println("Average => "+avg);
			System.out.println("Product => "+(int)pro);
			break;
		}
		}
	}
	}

}
