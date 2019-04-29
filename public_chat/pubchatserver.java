import java.net.*;
import java.io.*;

class pubchatserver 
{
   int i,j;       
   PrintStream ps[]=new PrintStream[20];
   BufferedReader br[]=new BufferedReader[20];
   Socket s[]=new Socket[20];
   Thread t,t1;
   String str;
   ServerSocket ss;
   pubchatserver()
   {
            try
      {
         ss=new ServerSocket(8000);   
         t=new Thread(new ThreadMaker());
	 t.start();	
      }
      catch(Exception e)
      {
	
      }
   }
   class ThreadMaker extends Thread
   {
      public void run()
      {
         while(true)
         {
            try
            {
                s[i]=ss.accept();
                ps[i]=new PrintStream(s[i].getOutputStream(),true);
                br[i]=new BufferedReader(new InputStreamReader(s[i].getInputStream()));
		t1=new Thread(new ThreadMaker1(i));
		t1.start();
		i++;
            }
            catch(Exception e)
            {
	
            } 
         }
      }
   }
   class ThreadMaker1 extends Thread
   {
      int n,no;
      ThreadMaker1(int i)
      {
            n=i;
            no=n+1;
      }
      public void run()
      {
         while(true)
         {
            try
            {
                str=br[n].readLine();
                System.out.println(str);
		for(j=0;j<=i;j++)
                {
                   if(n!=j)
                     ps[j].println("client"+no+":"+str);
		   if(str.equals("exit"))
			System.exit(0);
                }
            }
            catch(Exception e)
            {
	
            } 
         }
      }
   }
   public static void main(String args[])
   {
     pubchatserver pcs=new pubchatserver();

   }
}

