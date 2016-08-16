/*
 * Leer un número y calcularle el factorial a todos los enteros comprendidos entre 1 y el número
leído
 */
package pactica;

import java.util.Scanner;

/**
 *
 * @author SEBASTIAN
 */
public class pto11 {
    public static void main(String[] args) {
        double num;
        int leido;
        long  aux=1;
        
        Scanner lector = new Scanner (System.in);
        System.out.print("Ingrse numero: ");
        num =lector.nextDouble();
        
        leido = (int)num;
        for( int i=1;i<=leido;i++){
            //for(int j=1;j<=i;j++){
               aux=aux*i; 
            //}
            System.out.println("factorial "+ i +": "+aux);
        }
        
        
    }
}
