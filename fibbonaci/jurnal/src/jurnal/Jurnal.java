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
        Scanner rey = new Scanner(System.in);
        System.out.print("Masukkan jumlah angka : ");
        int in = rey.nextInt();
        
        int fib[] = new int[in];
        
        fib[0] = 0;
        fib[1] = 1;
        
        for (int i = 2; i < in; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        for (int i = 0; i < in; i++) {
            System.out.print(fib[i] + " ");
        }
    }
    
}
