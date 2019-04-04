import java.io.*;

import java.net.*;

import java.util.*;

class udpClient1{

DatagramSocket ds;

DatagramPacket dp;

byte[] recevpacket;

byte[] sendpacket;

BufferedReader in;

InetAddress ip;

int port;

String str;

public udpClient1() 

{

 try{



in=new BufferedReader(new InputStreamReader(System.in));

ip=InetAddress.getByName("localhost");

ds=new DatagramSocket();

while(true){

sendpacket =new byte[100];

recevpacket=new byte[100];

System.out.println("Client : ");

str=in.readLine();

sendpacket=str.getBytes();

dp=new DatagramPacket(sendpacket,sendpacket.length,ip,1450);

ds.send(dp);
if(str.equals("exit"))	

{System.exit(0);

}

ip=dp.getAddress();

port=dp.getPort();

dp=new DatagramPacket(recevpacket,recevpacket.length,ip,port);

ds.receive(dp);

String data=new String(dp.getData(),0,dp.getLength());

System.out.println("Server : "+data);

if(data.equals("exit"))	

{System.exit(0);

}

}



}



catch(Exception e)

 {

 System.out.println("The Error is "+e);

 }





}



public static void main(String args[])throws IOException

{

udpClient1 obj=new udpClient1();  

}



}