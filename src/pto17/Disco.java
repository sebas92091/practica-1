/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pto17;

import java.util.Scanner;

/**
 *
 * @author SEBASTIAN
 */
public class Disco extends publicacion {
    private int minutos;

   public void ingresarDatos(){
       Scanner lector = new Scanner(System.in);
        System.out.println("Titulo: ");
        setTitulo(lector.nextLine());
        System.out.println("Precio: ");
        setPrecio(lector.nextDouble());
        System.out.println("Duracion:  ");
        minutos= lector.nextInt();
        System.out.println("Datos de ventas:  ");
        Leer();
   }

    public void mostrar(){
        
        System.out.println("Titulo: "+getTitulo()+"\n"+
                "Precio: "+getPrecio()+"\n"+
                "Duracion: "+minutos);
        Mostrar();
    }
    
}
