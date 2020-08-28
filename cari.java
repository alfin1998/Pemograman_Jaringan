package praktikum2;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class cari
{
    public static void main(String[] args)
    {
        System.out.println("Masukkan IP: ");
        Scanner s = new Scanner(System.in);
        String ip = s.nextLine();
        
        try
        {
            InetAddress address = InetAddress.getByName(ip);
            String Ip = address.getHostAddress().substring(0,address.getHostAddress().indexOf('.'));

            if (Integer.parseInt(Ip) < 128)
            { System.out.println("IP Class A"); }
            else if (Integer.parseInt(Ip) < 192)
            { System.out.println("IP Class B"); }
            else if (Integer.parseInt(Ip) < 224)
            { System.out.println("IP Class C"); }
            else if (Integer.parseInt(Ip) < 240)
            { System.out.println("IP Class D Multicast"); }
            else
            { System.out.println("IP Class E"); }
        }
        catch (UnknownHostException uhe)
        { uhe.printStackTrace(); }
    }    
}


