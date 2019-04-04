import java.io.*;
class prime
{
	public static void main(String args[]) throws IOException
	{
		int n,i,j,f=0;
		System.out.println("enter the limit");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(br.readLine());
		System.out.println("");
		System.out.println(1);
		System.out.println(2);
		for(i=3;i<n;i++)
		{	
			f=0;
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					f=1;
				}
			}
			if(f==0)
			{
				System.out.println(i);
			}			
		}
	}
}
				