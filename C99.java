package practice;
import java.io.*;
class TelephoneDirectory
{
String name;
long tn;
long mn;
String hof;
String un;
String u="td10";
static int i=0;
void setdata(String n,long t,long m,String h)
{
name=n;
tn=t;
mn=m;
hof=h;
un=u+i;
i++;
}
void getdata()
{
System.out.println("Unique number -> "+un);
System.out.println("Name -> "+name);
System.out.println("Telephone number -> "+tn);
System.out.println("Mobile number -> "+mn);
System.out.println("Head of the family -> "+hof);
}
static int pf(TelephoneDirectory[] arr,int n) throws IOException
{
int i,pos=-1;
System.out.println("Enter Telephone id => ");
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String acn=br.readLine();
for(i=0;i<n;i++)
	{
	if(acn.equals(arr[i].un))
		pos=i;
	}
return pos;
}
}
public class C99 
{
public static void main(String[] args) throws IOException
{
int i=1,count=0,choice,pos,ch;
long t,m;
String n,h;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
TelephoneDirectory arr[]=new TelephoneDirectory[100];
while(i!=0)
{
System.out.println("Enter 1 to insert data");
System.out.println("Enter 2 to update data");
System.out.println("Enter 3 to search data");
System.out.println("Enter 4 to exit");
System.out.print("Enter choice -> ");
choice=Integer.parseInt(br.readLine());
switch(choice)
{
case 1:
	System.out.println("Enter Name -> ");
	n=br.readLine();
	System.out.println("Enter Telephone number -> ");
	t=Long.parseLong(br.readLine());
	System.out.println("Enter Mobile number -> ");
	m=Long.parseLong(br.readLine());
	System.out.println("Enter Head of the family name -> ");
	h=br.readLine();
	arr[count]=new TelephoneDirectory();
	arr[count].setdata(n,t,m,h);
	count++;
	break;
case 2:
	pos=TelephoneDirectory.pf(arr,count);
	if(pos<0)
		System.out.println("Account not found !!!");
	else 
	{
	System.out.println("Enter 1 to update Name");
	System.out.println("Enter 2 to update Telephone number");
	System.out.println("Enter 3 to update Mobile number");
	System.out.println("Enter 4 to update Family name");
	System.out.println("Enter choice");
	ch=Integer.parseInt(br.readLine());
	switch(ch)
	{
	case 1:
	System.out.println("Enter Name -> ");
	n=br.readLine();
	arr[pos].name=n;
	break;
	case 2:
	System.out.println("Enter Telephone number -> ");
	t=Long.parseLong(br.readLine());
	arr[pos].tn=t;
	break;
	case 3:
	System.out.println("Enter Mobile number -> ");
	m=Long.parseLong(br.readLine());
	arr[pos].mn=m;
	break;
	case 4:
	System.out.println("Enter Head of the family name -> ");
	h=br.readLine();
	arr[pos].hof=h;
	break;
	default:System.out.println("Invalid choice !!!");
	break;
	}
	}
	break;
case 3:
	pos=TelephoneDirectory.pf(arr,count);
	if(pos<0)
		System.out.println("Account not found !!!");
	else 
	{	
	arr[pos].getdata();
	}
	break;
case 4:i=0;
	break;
default:System.out.println("Invalid choice !!!");
	break;
}
}
}
}
