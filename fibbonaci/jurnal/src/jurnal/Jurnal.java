/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnal;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class Jurnal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int b =1;
        Scanner rey = new Scanner(System.in);
        System.out.print("Masukkan jumlah angka : ");
        int in = rey.nextInt();
        
        b = in - b;
        in =  in + b;
        System.out.println(in+" ");
    }
    
}
