import java.io.*;
import java.net.*;
import java.util.HashMap; 
import java.util.Map; 

class ServerProgram implements Runnable{
    int clientA=1060,serverport=1050;
    HashMap<String, Integer> map = new HashMap<>(); 
    DatagramSocket ds;
    Thread recThread;

    ServerProgram() throws Exception
    {
        ds = new DatagramSocket(serverport);

        recThread=new Thread(this);
        recThread.start();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true)
        {
            String data=br.readLine();
            if(data.equals("EXIT"))
            {
                break;
            }
            DatagramPacket dp = new DatagramPacket(data.getBytes(),data.length(),InetAddress.getLocalHost(),clientA);
            ds.send(dp);
        }
        ds.close();
    }

    public void run() 
    {
        byte b[]=new byte[1000];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
            try
            {
                DatagramPacket dp = new DatagramPacket(b,b.length);
                ds.receive(dp);
                String data = new String(b,0,dp.getLength());
                int index = data.indexOf(' ');
                if(data.equals("Live"))
                {
                    for(Map.Entry e : map.entrySet())
                    {
                        data = e.getKey().toString();
                        DatagramPacket dp1 = new DatagramPacket(data.getBytes(),data.length(),InetAddress.getLocalHost(),dp.getPort());
                        ds.send(dp1);
                    }
                }
                else
                {
                    String command="exit";
                    if(index != -1)
                        command = data.substring(0,index);

                    if(command.equals("Send"))
                    {
                        index++;
                        int a = index;
                        char d[] = data.toCharArray();
                        while(d[a] != ' ')
                        {
                            a++;
                        }
                        command = data.substring(index,a);
                        int portnumber = map.get(command);
                        command = data.substring(a,data.length());
                         DatagramPacket dp3 = new DatagramPacket(command.getBytes(),command.length(),InetAddress.getLocalHost(),portnumber);
                        ds.send(dp3);
                       // System.out.println(command);
                    }
                    else
                    {
                        System.out.println(data + " Loged In");
                        map.put(data, dp.getPort());
                    }
                }
                //printMap(map);
                //System.out.println("Client : " +data);

            }catch(Exception E){}

        }
    }

    public static void printMap(Map<String, Integer> map)  
    { 
        if (map.isEmpty())  
        { 
            System.out.println("map is empty"); 
        } 
          
        else
        { 
            System.out.println(map); 
        } 
    } 

    public static void main(String []args) throws Exception
    {
        ServerProgram sp=new ServerProgram();

    }
}