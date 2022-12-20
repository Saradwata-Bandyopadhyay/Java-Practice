package practice;
public class C22 
{
	public static void main(String[] args) {
		int a=6,b=8,temp;
		System.out.println("Values before swapping a = "+a+" b = "+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("Values after swapping a = "+a+" b = "+b);
		int c=6,d=8;
		System.out.println("Values before swapping c = "+c+" d = "+d);
		c=c+d;
		d=c-d;
		c=c-d;
		System.out.println("Values after swapping c = "+c+" d = "+d);
	}

}
