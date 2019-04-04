import java.io.*;
import java.net.*;
class Client
{
	Socket cs;
	BufferedReader in1;;
	PrintWriter out;
	String str;
	public Client()
	{
	try
	{
		in1=new BufferedReader(new InputStreamReader(System.in));
		cs=new Socket("localhost",2004);
		out=new PrintWriter(cs.getOutputStream(),true);
		while(true)
		{
			System.out.println("Client : ");
			str=in1.readLine();
			out.println(str);
			if(str.equals("exit"))
			{
			System.exit(0);
			}
		}
	}
	catch(Exception e){}
	}
	public static void main(String args[])
	{
		Client s=new Client();
	}
}