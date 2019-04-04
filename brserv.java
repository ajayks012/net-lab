import java.io.*;
import java.net.*;
class brserv
{
	int i=0;
	ServerSocket ss;
	Thread t;
	Socket s[]=new Socket[10];
	PrintStream ps=new PrintStream[10];
	BufferedReader br;
	String str;
	int j;
	brserv()
	{
	try{
		t=new Thread(new threas1());
		t.start();
		ss=new ServerSocket(8000);
		br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the broadcast message");
		while(true)
		{
			str=br.readline();
			for(j=0;j<i;j++)
			{
				PrintStream[j].println(str);
			}
			if(str.equals("exit")
				System.exit(0);
		}
	}
	catch(Exception e){}
	}
	public static void main(String args[])
	{	
		brserv s=new brserv();
	}
}
	class thread1 extend Thread
	{
		public void run()
		{
			while(true)
			{
			try{
				s[i]=ss.accept;
				PrintStream[i]=new PrintStream(s[i].getOutputStream(),true);
				i++;
			}
			catch(Exception e){}
			}
		}
	}
}		