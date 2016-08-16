/*
 *Una editorial de libros y discos desea crear fichas que almacenen el título y el precio de
cada publicación. Crear la correspondiente clase (denominada Publicación) que implemente
los datos anteriores. A partir de esta clase, diseñar dos clases derivadas: Libro, con el
número de páginas, año de publicación y precio; y la clase Disco, con duración en minutos y
precio Cada una de las tres clases tendrá una función mostrar(), para visualizar sus datos.
Escribir un programa que cree instancias de las clases Libro y Disco, solicite datos al usuario
y a continuación los visualice.

 */
package pto16;

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
                              "2. Ingresar Dsico\n"+
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
