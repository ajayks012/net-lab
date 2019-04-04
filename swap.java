import java.io.*;
class swap
{
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		System.out.println("a="+a);
		System.out.println("b="+b);
		int c=a;
		a=b;
		b=c;
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}