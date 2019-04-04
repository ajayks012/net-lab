import java.io.*;
import java.net.*;
class brcli{
	int i=0;
	Socket s;
	BufferedReader br;
	String str;
	brcli()
	{
	try{
		s=new Socket("localhost",8000);
		br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		while(true)
		{
		try{
			str=br.readLine();
			System.out.Println(str);
			if(str.equals("exit"))
				System.exit(0);
		}
		catch(Exception e){}
		}
	}
	catch(Exception e){}
	}
	public ststic void main(String args[])
	{
		brcli c=new brcli();
	}
}