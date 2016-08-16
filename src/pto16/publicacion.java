/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pto16;

/**
 *
 * @author SEBASTIAN
 */
public class publicacion {
    private String titulo;
    private double precio;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getPrecio() {
        return precio;
    }
    
    
    
    public void mostrar(){
        System.out.println("Titulo: "+titulo+"\n"+
                "Precio: "+precio);
    }
    
}
