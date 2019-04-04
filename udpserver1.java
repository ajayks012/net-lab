import java.io.*;

import java.net.*;

import java.util.*;

class udpServer1{

DatagramSocket ds;

DatagramPacket dp;

byte[] recevpacket;

byte[] sendpacket;

BufferedReader in;

InetAddress ip;

int port;

String str;

public udpServer1() 

{

 try{

 ds=new DatagramSocket(1450);

 recevpacket=new byte[100];

 sendpacket=new byte[100];

 while(true)

 {

 dp=new DatagramPacket(recevpacket,recevpacket.length);

 ds.receive(dp);

String data=new String(dp.getData(),0,dp.getLength());

System.out.println("client : "+data);
if(data.equals("exit"))	

	System.exit(0);

ip=dp.getAddress();

port=dp.getPort();

System.out.println("Server : ");

in=new BufferedReader(new InputStreamReader(System.in));

String msg1=in.readLine();

sendpacket=msg1.getBytes();

dp=new DatagramPacket(sendpacket,sendpacket.length,ip,port);

ds.send(dp);

if(msg1.equals("exit"))	

	System.exit(0);

 }





    }

catch(Exception e)

 {

 System.out.println("The Error is "+e);

 }





}



public static void main(String args[])throws IOException

{

udpServer1 obj=new udpServer1();  

}



}