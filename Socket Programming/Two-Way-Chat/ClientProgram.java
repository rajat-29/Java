import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;

class ClientProgram implements Runnable
{
    int clientport=1050,serverport=1051;
    DatagramSocket ds;
    Thread recThread;

    ClientProgram() throws Exception
    {
        ds=new DatagramSocket(clientport);
        recThread=new Thread(this);
        recThread.start();

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
            System.out.println("Enter Messaage : ");
            String data=br.readLine();
            if(data.equals("EXIT"))
            {
                break;
            }
            DatagramPacket dp=new DatagramPacket(data.getBytes(),data.length(),InetAddress.getLocalHost(),serverport);
            ds.send(dp);
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
        ClientProgram cp=new ClientProgram();
    }
}
