import java.io.*;
import java.net.*;
class Server2
{
	ServerSocket ss;
	Socket cs;
	BufferedReader in,in1;
	PrintWriter out;
	String str;
	public Server2()
	{
		try
		{
			ss=new ServerSocket(2004);
			cs=ss.accept();
			in=new BufferedReader(new InputStreamReader(cs.getInputStream()));
			in1=new BufferedReader(new InputStreamReader(System.in));
			out=new PrintWriter(cs.getOutputStream(),true);
			while(true)
			{
				str=in.readLine();
				if(str.equals("exit"))
				{
					System.exit(0);
				}
				System.out.println("Client : "+str);
				System.out.print("Server : ");
				str=in1.readLine();
				out.println(str);
				if(str.equals("exit"))
				{
					System.exit(0);
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String args[])
	{
		Server2 s=new Server2();
	}
}