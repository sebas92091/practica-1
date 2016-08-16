/*
 * clase Nombre que contenga tres atributos: nombre, primer_apellido y
segundo_apellido, un constructor y dos funciones miembro: Leer_nombre(), que obtiene
valores para los atributos de la clase, y Mostrar_nombre() que ofrece la visualización del
nombre completo.
 */
package pto18;

import java.util.Scanner;

/**
 *
 * @author SEBASTIAN
 */
public class Nombre {
    private String nombre, primer_apellido, segundo_apellido;
    
   public  void Nombre(){
       nombre = null;
       primer_apellido=null;
       segundo_apellido=null;
    }
   
   public void Leer_nombre(){
       Scanner lector= new Scanner(System.in);
       System.out.print("nombre: ");
       nombre= lector.next();
       System.out.print("primer apellido: ");
       primer_apellido= lector.next();
       System.out.print("segundo apellido: ");
       segundo_apellido= lector.next();
    }
   
   public void Mostrar_nombre(){
       System.out.println(nombre+" "+primer_apellido+" "+segundo_apellido );
   }
}
