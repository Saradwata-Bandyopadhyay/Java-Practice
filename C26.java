package practice;
public class C26 {
	public static void main(String[] args) {
	int num=9999,r,num2=0,count=0;
	System.out.println("Before addition of 2 => "+num);
	while(num!=0)
	{
	r=num%10;
	num=num/10;
	if(r+2>9)
	num2=num2+(int)(Math.pow(10,count)*((r+2)%10));
	else num2=num2+(int)(Math.pow(10,count)*(r+2));
	count++;
	}
	System.out.println("After addition of 2 => "+num2);
	}

}
