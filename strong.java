import java.io.*;
class strong
{
	public int fact(int n)
	{
		int i;
		int f=1;
		for(i=1;i<=n;i++)
		{
			f=f*i;
		}
		return f;
	}

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
			sum=sum+fact(r);
			n=n/10;
		}
		if(sum==t)
		{	
			System.out.println("strong");
		}
		else
		{
			System.out.println("not strong");
		}
	}
}