import java.net.*;
import java.io.*;

class pubchatclient 
{

   Socket s;

   BufferedReader br,br1;
   PrintStream ps;
   Thread t1;
   String str,str1;   
   pubchatclient()
   {

      try
      {
         s=new Socket("localhost",8000);         
	 ps=new PrintStream(s.getOutputStream(),true);	
	 br=new BufferedReader(new InputStreamReader(s.getInputStream()));	
	br1=new BufferedReader(new InputStreamReader(System.in)); 
	 t1=new Thread(new ThreadMaker());
	 t1.start();
	while(true)
	{
	str=br1.readLine();
           ps.println(str);
		if(str.equals("exit"))
		System.exit(0);
	}
	
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
                str1=br.readLine();
                System.out.println(str1);   
		String s1=str1.substring(8);
		System.out.println(s1);
		if(s1.equals("exit"))
			System.exit(0);          
            }
            catch(Exception e)
            {
            } 
         }
      }
   }  
     public static void main(String args[])
   {
     pubchatclient pcc=new pubchatclient();
        }
}

