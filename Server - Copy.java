import java.io.*;
import java.net.*;
class Server
{
	ServerSocket ss;
	Socket cs;
	BufferedReader in;
	String str;
	public Server()
	{
	try
	{
		ss=new ServerSocket(2004);
		cs=ss.accept();
		in=new BufferedReader(new InputStreamReader(cs.getInputStream()));
		while(true)
		{
			str=in.readLine();
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