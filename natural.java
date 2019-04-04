import java.io.*;
class natural
{
	public static void main(String args[]) throws IOException
	{
		int n,i;
		int sum=0;
		System.out.println("enter the limit");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(br.readLine());
		for(i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum of "+n+" natural nos = "+sum);
	}
}		