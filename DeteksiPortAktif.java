/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas5;

/**
 *
 * @author YOUNGKY
 */
import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;

public class Soal1 
{ public static void main(String[] args) 
{ 
ServerSocket theServer;
System.out.println("Mendeteksi port yang aktif 500 - 1000:");
for (int i = 500; i <= 1000; i++) 
{ 
    try 
{ 
  	theServer = new ServerSocket(i); 
        theServer.close(); 
} 
catch (IOException e) 
{ 
System.out.println("There is a server on port " + i + "."); 
} 
} 
} 
} 