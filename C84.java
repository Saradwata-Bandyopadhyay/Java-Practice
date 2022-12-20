package practice;
import java.util.Scanner;
public class C84 {

	public static void main(String[] args) 
	{
	try(Scanner sc=new Scanner(System.in);)
	{
	String str;
	int i,j=97,max=0;
	char ch='a';
	int arr[]=new int [26];
	System.out.println("Enter a string => ");
	str=sc.nextLine();
	for(i=0;i<str.length();i++)
	{
	switch(str.charAt(i))
	{
	case 'a':arr[0]=arr[0]+1;
	break;
	case 'b':arr[1]=arr[1]+1;
	break;
	case 'c':arr[2]=arr[2]+1;
	break;
	case 'd':arr[3]=arr[3]+1;
	break;
	case 'e':arr[4]=arr[4]+1;
	break;
	case 'f':arr[5]=arr[5]+1;
	break;
	case 'g':arr[6]=arr[6]+1;
	break;
	case 'h':arr[7]=arr[7]+1;
	break;
	case 'i':arr[8]=arr[8]+1;
	break;
	case 'j':arr[9]=arr[9]+1;
	break;
	case 'k':arr[10]=arr[10]+1;
	break;
	case 'l':arr[11]=arr[11]+1;
	break;
	case 'm':arr[12]=arr[12]+1;
	break;
	case 'n':arr[13]=arr[13]+1;
	break;
	case 'o':arr[14]=arr[14]+1;
	break;
	case 'p':arr[15]=arr[15]+1;
	break;
	case 'q':arr[16]=arr[16]+1;
	break;
	case 'r':arr[17]=arr[17]+1;
	break;
	case 's':arr[18]=arr[18]+1;
	break;
	case 't':arr[19]=arr[19]+1;
	break;
	case 'u':arr[20]=arr[20]+1;
	break;
	case 'v':arr[21]=arr[21]+1;
	break;
	case 'w':arr[22]=arr[22]+1;
	break;
	case 'x':arr[23]=arr[23]+1;
	break;
	case 'y':arr[24]=arr[24]+1;
	break;
	case 'z':arr[25]=arr[25]+1;
	break;
	}
	}
	System.out.println("Frequency of each characters => ");
	for(i=0;i<26;i++)
		if(arr[i]>0)
		{
		if(arr[i]>max)
		{
		max=arr[i];
		ch=(char)(j+i);
		}
		System.out.println((char)(j+i)+" => "+arr[i]);
		}
	System.out.println("Most frequently repeated character is => "+ch);
	sc.close();
	}
	}
}