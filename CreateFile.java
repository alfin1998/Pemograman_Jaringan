package Tugas4;

import java.io.*;

public class Soal1 {

    public static void main(String[] args) {
        
        try{
            String txt;
            BufferedReader br;
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Masukkan isi file : ");
            txt= br.readLine();

            File fl = new File("C:\\\\Users\\\\Alfin\\\\Documents\\\\NetBeansProjects\\\\PraktikumJaringan4\\\\tugas1.txt");
            
            if(!fl.exists()){
                fl.createNewFile();
            }
            
            FileWriter f = new FileWriter(fl, true);
            BufferedWriter b = new BufferedWriter(f);
            
            b.write(txt);
            b.close();
            
            System.out.println("file telah berhasil dibuat");
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
}