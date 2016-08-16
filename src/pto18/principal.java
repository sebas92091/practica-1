/*
 * Diseñar una clase Nombre que contenga tres atributos: nombre, primer_apellido y
segundo_apellido, un constructor y dos funciones miembro: Leer_nombre(), que obtiene
valores para los atributos de la clase, y Mostrar_nombre() que ofrece la visualización del
nombre completo.
Diseñar otra clase derivada llamada Dirección que tome la información de nombre y añada
calle, ciudad, provincia y código postal. Esta clase debe tener acceso a las funciones públicas
de la clase base, además, definir tres funciones miembro: Nueva_dirección, Nuevo_nombre()
y Mostrar(). Escribir un programa que cree un objeto de dirección, lea los datos y visualice
la información.
 */
package pto18;

import java.util.Scanner;

/**
 *
 * @author SEBASTIAN
 */
public class principal {
    public static void main(String[] args) {
        Direccion usuario =new Direccion();
        boolean i=true;
        int opcion=0;
        Scanner lector=new Scanner(System.in);
        
        while(i){
            System.out.println("1. Ingresar Nombre\n"+
                                "2. Ingresar Direccion\n"+
                                "3. visualizar\n"+
                                "4. salir");
            opcion=lector.nextInt();
            switch(opcion){
                case 1: usuario.Nuevo_nombre();    
                break; 
                
                case 2: usuario.Nueva_dirección();
                break;
                
                case 3: usuario.Mostrar();
                break; 
                
                case 4: i=false;
                break;
            }
        }
        
    }
}
