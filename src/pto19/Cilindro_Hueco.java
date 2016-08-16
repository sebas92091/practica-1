/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pto19;

/**
 *
 * @author SEBASTIAN
 */
public class Cilindro_Hueco extends Cilindro{
    private double r_interno, area_base;

    public double getR_interno() {
        return r_interno;
    }

    public void setR_interno(double r_interno) {
        this.r_interno = r_interno;
    }
    
    public void area_hueco(){
        System.out.println("Area lateral: "+Circunferencia()*getAltura());
        area_base= Math.PI*(Math.pow(getRadio(), 2)- Math.pow(r_interno, 2));
      System.out.println("Area total: "+(Circunferencia()*getAltura()+ 2*area_base ));
    }
}
