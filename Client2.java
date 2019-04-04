import java.io.*;
import java.net.*;
class Client2
{
 	Socket cs;
	BufferedReader in1,in2;
	PrintWriter out;
	String str;
	public Client2()
	{
		try
		{
			in1=new BufferedReader(new InputStreamReader(System.in));
			cs=new Socket("localhost",2004);
			in2=new BufferedReader(new InputStreamReader(cs.getInputStream()));
			out=new PrintWriter(cs.getOutputStream(),true);
			while(true)
			{
				System.out.print("Client : ");
				str=in1.readLine();
				out.println(str);
				if(str.equals("exit"))
				{
					System.exit(0);
				}
				str=in2.readLine();
				if(str.equals("exit"))
				{
					System.exit(0);
				}
				System.out.println("Server : "+str);
			}
		}catch(Exception e){}
	}
	public static void main(String args[])
	{
		Client2 s=new Client2();
	}
}