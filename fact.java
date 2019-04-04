import java.io.*;
class fact
{
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
		int i;
		int f=1;
		for(i=1;i<=n;i++)
		{
			f=f*i;
		}
		System.out.println(n+"! = "+f);
			
	}
}