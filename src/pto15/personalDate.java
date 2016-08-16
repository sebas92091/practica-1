/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pto15;

import java.util.Scanner;

/**
 *
 * @author SEBASTIAN
 */
public class personalDate {
    private  String nombre, apellido,edad, cedula, fecha, dir, tel;

    public void setDir(String dir) {
        this.dir = dir;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    
    
    
    public void Loading_Data(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Nombre ");
        nombre=lector.next();
        
        System.out.println("Edad ");
        edad=lector.next();
        
        System.out.println("Cedula ");
        cedula=lector.next();
        
        System.out.println("Fecha ");
        fecha=lector.next();
        
        System.out.println("Direccion");
        dir=lector.next();
        
        System.out.println("Telefono ");
        tel=lector.next();
        
    }
    
    public void Data_Show(){
        System.out.println("Nombre: "+nombre+"\n"+
                           "Apellido: "+edad+"\n"+
                           "edad: "+edad+"\n"+
                           "cedula: "+cedula+"\n"+
                           "fecha: "+fecha+"\n"+
                           "direccion: "+dir+"\n"+
                           "telefono: "+tel+"\n"       
        );
    }
}
