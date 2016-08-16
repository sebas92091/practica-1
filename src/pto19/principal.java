/*
 * Diseñar una jerarquía de clases: Círculo, Cilindro y CilindroHueco. En esencia, se puede decir
que un objeto cilindro es un objeto círculo con una altura, y un cilindro hueco es un cilindro
con un espacio huevo dentro de él. La clase Círculo debe tener un dato Radio (tipo double) y
unas funciones miembro LeerRadio, Area y Circunferencia, que obtienen el valor del radio y
calculan el área del círculo y la longitud de la circunferencia. Escribir un programa que
permita crear objetos Circulo, Cilindro y CilindroHueco y calcule la longitud de la
circunferencia y las áreas del círculo, del cilindro y del cilindro hueco.

 */
package pto19;

import java.util.Scanner;

/**
 *
 * @author SEBASTIAN
 */
public class principal {
    public static void main(String[] args) {
        Circulo cir = new Circulo();
        Cilindro cil = new Cilindro();
        Cilindro_Hueco hueco = new Cilindro_Hueco();
        boolean i=true;
        int opcion=0;
        Scanner lector=new Scanner(System.in);
        
        while(i){
            System.out.println("1. Circulo\n"+
                                "2. Cilindro\n"+
                                "3. Cilondro Hueco\n"+
                                "4. salir");
            opcion=lector.nextInt();
            switch(opcion){
                case 1: 
                    System.out.print("Ciculo\nIngrese Radio: ");
                    cir.LeerRadio(lector.nextDouble());
                    System.out.println("Area: "+cir.Area());
                    System.out.println("Circunferencia: "+cir.Circunferencia());
                    
                break;
                    
                case 2: 
                    System.out.print("Cilindro\nIngrese Radio: ");
                    cil.LeerRadio(lector.nextDouble());
                    System.out.print("Ingrese Altura: ");
                    cil.setAltura(lector.nextDouble());
                    cil.area_cilindro();
                    System.out.println("Circunferencia: "+cil.Circunferencia());
                break;
                
                case 3: 
                    System.out.print("Cilindro Hueco\nIngrese Radio externo: ");
                    hueco.LeerRadio(lector.nextDouble());
                    System.out.print("Ingrese Radio interno: ");
                    hueco.setR_interno(lector.nextDouble());
                    System.out.print("Ingrese Altura: ");
                    hueco.setAltura(lector.nextDouble());
                    hueco.area_hueco();
                    System.out.println("Circunferencia: "+hueco.Circunferencia());
                break;
                
                case 4: 
                    i=false;
                break;
            }
        }
    }
}
