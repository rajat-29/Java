import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;

class ClientB implements Runnable
{
    int clientB=1070,serverport=1050;
    DatagramSocket ds;
    Thread recThread;

    ClientB() throws Exception
    {
        ds=new DatagramSocket(clientB);
        recThread=new Thread(this);
        recThread.start();

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter Name : ");
            String data=br.readLine();
            DatagramPacket dp=new DatagramPacket(data.getBytes(),data.length(),InetAddress.getLocalHost(),serverport);
            ds.send(dp);

        while(true)
        {
            System.out.println("Enter Message : ");
            String d=br.readLine();
            DatagramPacket dp1=new DatagramPacket(d.getBytes(),d.length(),InetAddress.getLocalHost(),serverport);
            ds.send(dp1);
            break;
        }
    }

    public void run()
    {
        byte b[]=new byte[1000];
        while(true){
            try{
                DatagramPacket dp=new DatagramPacket(b,b.length);
                ds.receive(dp);
                String data=new String(b,0,dp.getLength());
                System.out.println("Server : " +data);

            }catch(Exception E){

            }
        }
    }
    public static void main(String []args) throws Exception
    {
        ClientB cp=new ClientB();
    }
}
