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
public class Ventas  {
    int[] num_Ventas=new int[6];
    
    public void Leer(){
        Scanner lector =new Scanner(System.in);
        for(int j=0;j<6;j++){
            System.out.print("Ventas mes "+(j+1)+": ");
            num_Ventas[j]=lector.nextInt();
        }
        
    }
    public void Mostrar(){
        System.out.println("Se vendieron");
        for(int j=0;j<6;j++){        
            System.out.println(num_Ventas[j]+" ejemplares en el mes"+(j+1));   
        } 
    }
}
