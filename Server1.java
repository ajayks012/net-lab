import java.io.*;
import java.net.*;
import java.util.*;
class Server
{
	ServerSocket ss;
	Socket cs;
	BufferedReader in;
	BufferedReader in1;
	PrintWriter out;
	String str;	
	String str1;
	public Server()
	{
	try
	{
		in1=new BufferedReader(new InputStreamReader(System.in));
		ss=new ServerSocket(2004);
		cs=ss.accept();
		in=new BufferedReader(new InputStreamReader(cs.getInputStream()));
		out=new PrintWriter(cs.getOutputStream(),true);
		while(true)
		{
			System.out.println("Server : ");
			str=in.readLine();
			str1=in1.readLine();
			if(str.equals("exit"))
			{
			System.exit(0);
			}
			System.out.println("Client : "+str);
		}
	}
	catch(Exception e){
		System.out.println(e);
	}
	}
	public static void main(String args[])
	{
		Server s=new Server();
	}
}