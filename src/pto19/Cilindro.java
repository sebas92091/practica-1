
package pto19;

/**
 *
 * @author SEBASTIAN
 */
public class Cilindro extends Circulo{
  private double altura   ;

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }
    
  
  public void area_cilindro(){
      System.out.println("Area lateral: "+Circunferencia()*altura);
      System.out.println("Area total: "+Circunferencia()*(altura+getRadio()));
  }
}
