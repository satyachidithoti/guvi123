import java.util.*;
import java.lang.*;
import java.io.*;

class Factorial
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int f=1;
		for(int i=1;i<=n;i++)
		f=f*i;
		System.out.println(f);
	}
}
