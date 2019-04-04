import java.io.*;
class fibonacci2
{
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
		System.out.println("upto "+n+" fiboncacci numbers");
		int a=0;
		int b=1;
		int c=a+b;
		int i;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		while(c<=n)
		{
			a=b;
			b=c;
			c=a+b;
			if(c>n)
			{
				break;
			}
			System.out.println(c);
		}
			
	}
}