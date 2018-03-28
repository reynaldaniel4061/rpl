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

    Scanner rey;
        int a1, b1, c1, a2, b2, c2, limit, i;
        
    public Jurnal(){
        rey = new Scanner (System.in);
        a1 = c1 = 1;
        b1 = a2 = b2 = c2 = limit = i = 0;
    }
    public void input(){
        try {
            System.out.printf("Enter limit: ");
            limit = rey.nextInt();
            rey.close();
        } catch (InputMismatchException | NumberFormatException e) {
            System.err.println("Error Occurred!");
            System.exit(0);
        }
    }
    public void compute() {
        for (; i < limit; i++) {
            a1 = b1;
            b1 = c1;
            c1 = a1 + b1;
            a2 = c1;
            c2 = b1;
        }
        System.out.println("Series in Reverse Order:");
        for (i = limit - 1; i >= 0; i--) {
            b2 = a2;
            a2 = c2;
            c2 = b2 - a2;
            System.out.print(c2+" ");
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Jurnal jr =  new Jurnal();
        jr.input();
        jr.compute();
    
    }
}
