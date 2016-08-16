/*
 * En la U de A hay una máquina dispensadora que tiene 4 productos etiquetados con los
números 1, 2, 3 y 4, cada uno con un valor de $500, $800, $300 y $900, respectivamente.
Defina un algoritmo que lea el número de producto que ingresa el usuario y que le muestre
su precio.
 */
package pactica;

import java.util.Scanner;

/**
 *
 * @author multi02
 */
public class pto6 {
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        
        int producto;
        System.out.print("Ingrse producto: ");
        producto =lector.nextInt();
        
        switch(producto){
            
            case 1:
                System.out.println("El producto tiene un valor de $500");
            break;
            
            case 2:
                System.out.println("El producto tiene un valor de $800");
            break;
            
            case 3:
                System.out.println("El producto tiene un valor de $300");
            break;
            
            case 4:
                System.out.println("El producto tiene un valor de $900");
            break;
            
            default:
                System.out.println("El producto no existe");
            break;
            
        }
        
    }
           
    
}
