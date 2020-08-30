import java.io.*;

class BacaKarakter{
    public static void main (String[] args){
        char c;
        try{
            BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
            System.out.println("Masukkan Karakter (akhir dengan \"q\") : ");
            do {
                c = (char) br.read();
                System.out.println("Karakter Terbaca : "+c);
            } while (c!='q');
        } catch(IOException e){
        System.out.println("Ada error IO");
        System.exit(0);
    }
  }
}