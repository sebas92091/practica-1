/*
 * La nota final del curso de Desarrollo de aplicaciones móviles está dividido en 
5 partes: Quices y seguimiento 20%, Prácticas de laboratorio 30%, Exposiciones 10%,
Proyecto I 15% y Proyecto Final el 25%, desarrolle un programa en java que permita 
calcular la nota final de un estudiante del curso. Después de calcular la nota final 
el programa imprimirá lo siguiente dependiendo de la nota:
a. Si la nota está entre 0 y 1 imprime “Estas en el lugar equivocado”
b. Si la nota está entre 1.1 y 2 imprime “Remal”
c. Si la nota está entre 2.1 y 3 imprime “Es posible recuperarse”
d. Si la nota está entre 3.1 y 4 imprime “Normalito”
e. Si la nota está entre 4.1 y 4.5 imprime “Muy Bien”
f. Si la nota está entre 4.6 y 5 imprime “Excelente estudiante”
 */
package pactica;

import java.util.Scanner;

/**
 *
 * @author multi02
 */
public class pto5 {
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        
        double seguimiento,lab ,expo, proyecto1, proyectoFinal, definitiva;
        System.out.print("Ingrse nota seguimiento: ");
        seguimiento =lector.nextInt();
        
        System.out.print("Ingrse nota laboratorio: ");
        lab =lector.nextInt();
        
        System.out.print("Ingrse nota expo: ");
        expo =lector.nextInt();
        
        System.out.print("Ingrse nota proyecto 1: ");
        proyecto1 =lector.nextInt();
        
        System.out.print("Ingrse nota proyecto final: ");
        proyectoFinal =lector.nextInt();
        
        definitiva= (seguimiento*0.2)+ (lab*0.3)+(expo*0.1) +(proyecto1*0.15)+
                (proyectoFinal*0.25);
        System.out.println("Nota definitva: "+definitiva);
        if( 0 <= definitiva &&  definitiva <= 1 )
        System.out.println("Estas en el lugar equivocado");
        else if( 1.1 <= definitiva &&  definitiva <= 2 )
        System.out.println("Remal");
        else if( 2.1 <= definitiva &&  definitiva <= 3 )
        System.out.println("Es posible recuperarse");
        else if( 3.1 <= definitiva &&  definitiva <= 4 )
        System.out.println("Normalito");
        else if( 4.1 <= definitiva &&  definitiva <= 4.5 )
        System.out.println("Muy Bien");
        else if( 4.6 <= definitiva &&  definitiva <= 5)
        System.out.println("Excelente estudiante");
    }
}
