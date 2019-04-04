import java.io.*;
class fibonacci
{
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
		System.out.println(n+" fiboncacci numbers");
		int a=0;
		int b=1;
		int c=a+b;
		int i;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		for(i=3;i<n;i++)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.println(c);
		}
			
	}
}