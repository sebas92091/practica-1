/*
 * La clase Círculo debe tener un dato Radio (tipo double) y
unas funciones miembro LeerRadio, Area y Circunferencia, que obtienen el valor del radio y
calculan el área del círculo y la longitud de la circunferencia
 */
package pto19;

/**
 *
 * @author SEBASTIAN
 */
public class Circulo {
    
    private double radio;

    public double getRadio() {
        return radio;
    }

    public void LeerRadio(double a){ radio=a; }
    public double Area(){ 
        return radio*radio*Math.PI;
    }
    public double Circunferencia(){
        return 2*radio*Math.PI;
    }
}
