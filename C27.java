package practice;
public class C27 {
	public static void main(String[] args) {
		int num=999,r,sum=0;
		while(num!=0)
		{
			r=num%10;
			num=num/10;
			sum=sum+r;
		}
		System.out.println("Sum of all the digits => "+sum);
	}

}
