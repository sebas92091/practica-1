/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pactica;

import java.util.Scanner;

/**
 *
 * @author multi02
 */
public class Pactica {
   // private static Object Systm;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner (System.in);
        
        double lado,area,volumen;
        System.out.print("digite el valor del lado: ");
        lado = lector.nextInt();
        
        area = lado*lado;
        volumen =Math.pow(lado, 3);
        System.out.println("el Area es: "+area+" El volumen es: "+volumen);
    }
    
}
