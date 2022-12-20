package practice;
import java.util.Scanner;
class std
{
int english,maths,science,rollnumber;
double avg;
void setdata(int eng,int mat,int sci,int rn)
{
english=eng;
maths=mat;
science=sci;
rollnumber=rn;
avg=(double)(english+maths+science)/3;
}
void getdata()
{
System.out.printf("\nRoll number %d got %.2f marks in average\n",rollnumber,avg);
}
}
public class C96 
{
	public static void main(String[] args) 
	{
	try(Scanner sc=new Scanner(System.in);)
	{
	int eng,mat,sci,i,rn;
	std arr[]= new std [8];
	for(i=0;i<8;i++)
	{
	arr[i]=new std();
	System.out.println("Enter Roll Number => ");
	rn=sc.nextInt();
	System.out.println("Enter marks of English out of 100 => ");
	eng=sc.nextInt();
	System.out.println("Enter marks of Maths out of 100 => ");
	mat=sc.nextInt();
	System.out.println("Enter marks of Science out of 100  => ");
	sci=sc.nextInt();
	arr[i].setdata(eng,mat,sci,rn);
	}	
	for(i=0;i<8;i++)
	{
	arr[i].getdata();	
	}
	sc.close();
	}
	}
}
