import java.io.*;
class armstrong
{
	public static void main(String args[]) throws IOException
	{
		int n,i,r,t,sum=0;
		System.out.println("enter the number");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(br.readLine());
		t=n;
		while(n>0)
		{	
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}
		if(sum==t)
		{	
			System.out.println("armstrong");
		}
		else
		{
			System.out.println("not armstrong");
		}
	}
}