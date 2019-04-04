import java.io.*;
import java.net.*;
class brserv
{
	int i=0;
	ServerSocket ss;
	Thread t;
	Socket s[]=new Socket[10];
	PrintStream ps[]=new PrintStream[10];
	BufferedReader br;
	String str;
	int j;
	public brserv()
	{
	try{
		t=new Thread(new thread1());
		t.start();
		ss=new ServerSocket(8000);
		br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the broadcast message");
		while(true)
		{
			str=br.readLine();
			for(j=0;j<i;j++)
			{
				ps[j].println(str);
			}
			if(str.equals("exit"))
				System.exit(0);
		}
	}
	catch(Exception e){}
	}
	public static void main(String args[])
	{	
		brserv s=new brserv();
	}
	class thread1 extends Thread
	{
		public void run()
		{
			while(true)
			{
			try{
				s[i]=ss.accept();
				ps[i]=new PrintStream(s[i].getOutputStream(),true);
				i++;
			}
			catch(Exception e){}
			}
		}
	}
}	