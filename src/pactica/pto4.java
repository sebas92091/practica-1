/*
 * Desarrollar un programa que calcule la nota definitiva de un estudiante en una 
asignatura, se sabe que durante el semestre académico se manejan tres notas con 
sus respectivos porcentajes así: seguimiento (50%), parcial I (25%) y parcial 2 (25%).
 */
package pactica;

import java.util.Scanner;

/**
 *
 * @author multi02
 */
public class pto4 {
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        
        double seguimiento,parcial1 ,parcial2, definitiva;
        System.out.print("Ingrse nota seguimiento: ");
        seguimiento =lector.nextInt();
        
        System.out.print("Ingrse nota parcial 1: ");
        parcial1 =lector.nextInt();
        
        System.out.print("Ingrse nota parcial 2: ");
        parcial2 =lector.nextInt();
        
        definitiva= (seguimiento*0.5)+(parcial1+parcial2)*0.25;
        System.out.println("La nota definitiva: "+definitiva);
    }
}
