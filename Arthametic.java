import java.util.*;
import java.lang.*;
import java.io.*;
 
class AP_Sum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=s.nextInt();
		int d=s.nextInt();
		int sum=a;
		for(int i=a;n!=0;i=i+d)
		{
			sum=sum+i;
 
			n=n-1;
		}
		System.out.println(sum);
 
	}
}
