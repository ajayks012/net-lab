import java.io.*;
import java.util.*;
import java.net.*;
class udpServer
{
	DatagramSocket ds;
	DatagramPacket dp;
	byte[] recevPacket;
	BufferedReader in;
	InetAddress ip;
	int port;
	String str;
	public udpServer()
	{
		try{
			ds=new DatagramSocket(1456);
			while(true)
			{
				recevPacket=new byte[100];
				dp=new DatagramPacket(recevPacket,recevPacket.length);
				ds.receive(dp);
				String data=new String(dp.getData());
				System.out.println("Client : "+data);
				if(data.equals("exit")){
					System.exit(0);
				}
			}
		}
		catch(Exception e){}
	}
	public static void main(String args[])
	{
		udpServer s=new udpServer();
	}
}