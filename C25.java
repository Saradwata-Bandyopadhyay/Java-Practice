package practice;
public class C25 {
	public static void main(String[] args) {
	int num=12345,sum=0,count=0,r;
	while(num!=0)
	{
	r=num%10;
	num=num/10;
	count++;
	if(count==2||count==5)
	sum=sum+r;
	}
	System.out.println("Sum of first and second last digits => "+sum);
	}

}
