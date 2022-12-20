package practice;
import java.io.*;
class random
{
void method(int i,char c)
{
	System.out.println("Integer first character second -> "+i+" , "+c);
}
void method(char c,int i)
{
	System.out.println("Character first integer second -> "+c+" , "+i);	
}
}
public class C108 
{
	public static void main(String[] args) throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter a number -> ");
	int num=Integer.parseInt(br.readLine());
	System.out.println("Enter a character -> ");
	char ch=(char)br.read();
	random r=new random();
	r.method(num, ch);
	r.method(ch, num);
	}
}
