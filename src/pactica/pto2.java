/*
 * Escriba un algoritmo que permita calcular la hipotenusa de un triángulo 
rectángulo utilizando el teorema de Pitágoras.
 */
package pactica;

import java.util.Scanner;

/**
 *
 * @author multi02
 */
public class pto2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        
        double lado1,lado2 ,hipotenusa;
        System.out.print("digite el valor del lado1: ");
        lado1 = lector.nextInt();
        System.out.print("digite el valor del lado2: ");
        lado2 = lector.nextInt();
        
        hipotenusa = Math.sqrt( (lado1*lado1) + (lado2*lado2) );
        
        System.out.println("La hipotenusa es: "+hipotenusa);
    }
}
