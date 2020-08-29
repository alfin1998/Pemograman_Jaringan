package praktikum2;
import java.net.*;
public class Praktikum2 {
   public static void main(String[] args)
{
try {
      InetAddress inet1 = InetAddress.getByName("www.polinema.ac.id"); //Host address
      System.out.println("HostAddress=" + inet1.getHostAddress());
      InetAddress inet2 = InetAddress.getByName("192.168.134.134");
      System.out.println("HostName=" + inet2.getHostName());
      if (inet1.equals(inet2))
            System.out.println("Alamat sama !");
	else 
            System.out.println ("Alamat tidak sama!");
   }
   catch (UnknownHostException uhe) {
      uhe.printStackTrace();
   }
}
}

