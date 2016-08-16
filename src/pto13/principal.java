/*
 * Implementar un programa que utilice clases y que permita visualizar los primeros n términos
de la serie Fibonacci. 
 */
package pto13;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author SEBASTIAN
 */
public class principal {
    
    public static void main(String[] args) {
        int n,i;
        int[] terminos;
        serie b = new serie();
        
        System.out.print("Ingrese el enesimo termino que desea ver de la serie: ");
        Scanner lector=new Scanner(System.in);
        n = lector.nextInt();
        //terminos = new int[n];
        //terminos = b.serie(n);
        
        
        System.out.println("Los primeros "+n+" terminos de la serie Fibonacci son:");
        System.out.println(Arrays.toString(b.serie(n)));       
        b.serie(n);
    }
}
