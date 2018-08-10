import java.util.*;
import java.lang.*;
import java.io.*;
 
class Median_Array
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=s.nextInt();
		Arrays.sort(a);
		int y=n/2;
		System.out.println(a[y]);
 
 
 
	}
}
