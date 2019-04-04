import java.io.*;
import java.net.*;

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
		ss=new ServerSocket(2004);
		cs=ss.accept();
		in1=new BufferedReader(new InputStreamReader(cs.getInputStream()));
		out=new PrintWriter(cs.getOutputStream(),true);
		while(true)
		{
			System.out.println("Server : ");
			str=in1.readLine();
			if(str.equals("exit"))
			{
			System.exit(0);
			}
			System.out.println("Client : "+str);
			in=new BufferedReader(new InputStreamReader(System.in));
			str1=in.readLine();
			out.println(str1);
			if(str1.equals("exit"))
			{
			System.exit(0);
			}
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