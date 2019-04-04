import java.io.*;
import java.util.*;
import java.net.*;
class udpClient
{
	DatagramSocket ds;
	DatagramPacket dp;
	byte[] sendPacket;
	byte[] recevPacket;
	BufferedReader in;
	InetAddress ip;
	int port;
	String str;
	public udpClient()
	{
		try{
			in=new BufferedReader(new InputStreamReader(System.in));
			ip=InetAddress.getByName("localhost");
			ds=new DatagramSocket();
			while(true)
			{
				sendPacket=new byte[100];
				System.out.println("client : ");
				str=in.readLine();
				sendPacket=str.getBytes();
				dp=new DatagramPacket(sendPacket,sendPacket.length,ip,1456);
				ds.send(dp);
				if(str.equals("exit")){
					System.exit(0);
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String args[])
	{
		udpClient c=new udpClient();
	}
}