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
public class Cliente extends personalDate {
    double saldo;
    Scanner lector;
    
    public void Actualizar_Datos(){
        lector = new Scanner(System.in);
        System.out.println("Direccion");
        setDir(lector.next());
        
        System.out.println("Telefono ");
        setTel(lector.next());
    }
    
    public void Consignacion(){
        System.out.println("Valor a consignar: ");
        saldo = lector.nextDouble();
    }
    
    public void Retiro(){
        double retiro;
        System.out.println("Valor a Retirar: ");
        retiro = lector.nextDouble();
        if (retiro>saldo){
            System.out.println("Saldo insuficiente ");
        }
        else{
            saldo=saldo-retiro;
        }
            
    }
    
    public void Consulatar_Saldo(){
        System.out.println("Su saldo es: "+saldo);
    }

}
