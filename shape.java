import java.io.*;
abstract class shape{
	abstract void s();	
}
class rectangle extends shape
{	
	public double a,b;
	void s()
	{
		double area=a*b;
		double peri=2*(a+b);
		System.out.println("AREA = "+area);
		System.out.println("PERIMETER = "+peri);
	}
}
class square extends shape
{
	public double a;
	void s()
	{	
		double area=a*a;
		double peri=4*a;
		System.out.println("AREA = "+area);
		System.out.println("PERIMETER = "+peri);
	}
}
class circle1 extends shape
{
	public double a;
	void s()
	{
		double area=3.14*a*a;
		double peri=2*3.14*a;
		System.out.println("AREA = "+area);
		System.out.println("PERIMETER = "+peri);
	}
}
class sp
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter 1 for CIRCLE, 2 for SQUARE, 3 for RECTANGLE");
		int n=Integer.parseInt(br.readLine());
		Double x,y;
		switch(n)
		{
			case 1: circle1 c=new circle1();
				System.out.println("enter the value of radius :");
				c.a=Double.parseDouble(br.readLine());
				c.s();
				break;
			case 2: square sq=new square();
				System.out.println("enter the value of side :");
				sq.a=Double.parseDouble(br.readLine());
				sq.s();
				break;
			case 3: rectangle r=new rectangle();
				System.out.println("enter the values of sides :");
				r.a=Double.parseDouble(br.readLine());
				r.b=Double.parseDouble(br.readLine());
				r.s();
				break;
			default: System.out.println("Invalid input");
		}
	}
}