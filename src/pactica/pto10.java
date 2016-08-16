/*
 * Leer un número de dos dígitos y determinar si pertenece a la serie de Fibonacci. 
 */
package pactica;

import java.util.Scanner;

/**
 *
 * @author SEBASTIAN
 */
public class pto10 {
    public static void main(String[] args) {
        int num,numFibo=1,aux=1,ant=1;
        boolean i=true;
        
        Scanner lector = new Scanner (System.in);
        System.out.print("Ingrse numero: ");
        num =lector.nextInt();
        while(i){
            numFibo=aux+ant;
            ant=aux;
            aux=numFibo;
            
            System.out.print(numFibo+" ");
            if (num == numFibo){
                System.out.println("El numero: "+num+" pertenese a la serie de Fibonacci");
                i=false;
            }
            else if (numFibo > num){
                System.out.println("El numero: "+num+" NO pertenese a la serie de Fibonacci");
                i=false;
            }
            
            
        }
    }
}
