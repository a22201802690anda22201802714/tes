/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1A223303;

import java.util.Scanner;

/**
 *
 * @author 
 */
public class PBO1A223303 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    int celc, kelv;
    double fahr, rea;
        // TODO code application logic here
    System.out.print("Menghitung Suhu\n");
    System.out.print("Masukkan Suhu Celcius = ");
    celc = input.nextInt();
    fahr = (1.8 * celc)+32;
    System.out.println("Suhu Fahrenheit       = "+fahr);
    rea = (0.8 * celc);
    System.out.println("Suhu Reamur           = "+rea);
    kelv = celc + 273;
    System.out.println("Suhu Kelvin           = "+kelv);
    }
    
}
