/*
 * Diseñar otra clase derivada llamada Dirección que tome la información de nombre y añada
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
public class Direccion extends Nombre {
    private String calle, ciudad, provincia, codigo_postal;
    
    public void Nueva_dirección(){
        Scanner lector= new Scanner(System.in);
       System.out.print("calle: ");
       calle= lector.next();
       System.out.print("ciudad: ");
       ciudad= lector.next();
       System.out.print("provincia: ");
       provincia= lector.next();
       System.out.print("codigo postal: ");
       codigo_postal= lector.next();
    }
    
    public void Nuevo_nombre(){
        Leer_nombre();
    }
    
    public void Mostrar(){
        Mostrar_nombre();
        System.out.println("Calle: "+calle+
                           "\nCiudad: "+ciudad+
                            "\nProvincia: "+provincia+
                            "\ncoigo postal: "+codigo_postal);
    }
}
