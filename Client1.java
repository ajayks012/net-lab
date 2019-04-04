import java.io.*;
import java.net.*;
import java.util.*;
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
		in1=new BufferedReader(new InputStreamReader(System.in));
		cs=new Socket("localhost",2004);
		in=new BufferedReader(new InputStreamReader(cs.getInputStream()));
		out=new PrintWriter(cs.getOutputStream(),true);
		while(true)
		{
			System.out.println("Client : ");
			str=in1.readLine();
			str1=in.readLine();
			out.println(str);
			if(str.equals("exit"))
			{
			System.exit(0);
			}
			System.out.println("Server : "+str1);
		}
	}
	catch(Exception e){}
	}
	public static void main(String args[])
	{
		Client c=new Client();
	}
}