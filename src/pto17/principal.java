/*
 * Se dispone de la clase Publicación del ejercicio anterior y se desea crear una nueva clase
base llamada Ventas que obtenga un arreglo con las ventas del último semestre de una
determinada publicación. Esta clase debe tener funciones miembros Leer() y Mostrar() que
obtenga y visualice las citadas ventas. Modificar las clases Libro y Disco, lea y visualice las
publicaciones.
 */
package pto17;

import java.util.Scanner;

/**
 *
 * @author SEBASTIAN
 */
public class principal {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String titulo;
        boolean i= true;
        int opcion =0,libroN=0,discoN=0;
        libro lib = new libro();
        Disco disc = new Disco();
        while(i){
            System.out.println("1. Ingresar Libro\n"+
                              "2. Ingresar Disco\n"+
                              "3. Mostrar libro y disco\n"+
                              "4. Salir");
            
            opcion= lector.nextInt();
            
            switch (opcion){
                case 1:
                    System.out.println("Datos Libro");
                    lib.ingresarDatos();
                break;
                case 2:
                    System.out.println("Datos Disco");
                    disc.ingresarDatos();
                break;
                
                case 3:
                    System.out.println("Libro");
                    lib.mostrar();
                    System.out.println("\nDisco");
                    disc.mostrar();
                break;
                
                case 4:
                    i=false;
                    
                break;
                
                    
            
            }
        
        }
    }
}
