package practice;
public class C28 {
	public static void main(String[] args) {
	int num=123,r;
	System.out.println("Before reversing => "+num);
	System.out.print("After reversing => ");
	while(num!=0)
	{
	r=num%10;
	num=num/10;
	System.out.print(r);
	}
	}
}
