package practice;
public class C3 
{
	public static void main(String[] args) 
	{
	int i,j,n=5,m=5,k;
	for(i=0;i<m;i=i+2)
	{
	for(k=0;k<=i;k++)
	{
	System.out.print(" ");
	}
	for(j=m;j>i;j--)
	{
	System.out.print("* ");
	}
	System.out.print("\n");
	}
	for(i=1;i<n;i=i+2)
	{
	for(k=n-1;k>i;k--)
	{
	System.out.print(" ");
	}
	for(j=0;j<=i+1;j++)
	{
	System.out.print("* ");
	}
	System.out.print("\n");
	}
	}
}
