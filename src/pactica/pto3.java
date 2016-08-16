/*
 * Dado el valor del lado de un triángulo equilátero, haga un algoritmo que 
calcule su perímetro, su altura y su área. 
 */
package pactica;

import java.util.Scanner;

/**
 *
 * @author multi02
 */
public class pto3 {
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        
        double lado,altura ,area, perimetro;
        System.out.print("digite el valor del lado: ");
        lado =lector.nextInt();
        
        perimetro = lado*3;
        altura = (lado/2)*Math.sqrt(3);  //Math.sqrt( (lado*lado) - ( (lado/2)*(lado/2) ) );
        area = (lado*altura)/2;
        
        System.out.println("El perimetro es: "+perimetro+" La altura: "+altura+" El area: "+
                            area);
    }
}
