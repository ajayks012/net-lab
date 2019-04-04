import java.io.*;
import java.net.*;

class Client
{
	Socket cs;
	ServerSocket ss;
	BufferedReader in1;
	BufferedReader in;
	PrintWriter out;
	String str;
	String str1;
	public Client()
	{
	try
	{
		in=new BufferedReader(new InputStreamReader(System.in));
		cs=new Socket("localhost",2004);
		out=new PrintWriter(cs.getOutputStream(),true);
		while(true)
		{
			System.out.println("Client : ");
			str1=in.readLine();
			out.println(str1);
			if(str1.equals("exit"))
			{
			System.exit(0);
			}
			in1=new BufferedReader(new InputStreamReader(cs.getInputStream()));
			str=in1.readLine();
			out.println(str);
			if(str.equals("exit"))
			{
			System.exit(0);
			}
			System.out.println("Server : "+str);
		}
	}
	catch(Exception e){}
	}
	public static void main(String args[])
	{
		Client c=new Client();
	}
}