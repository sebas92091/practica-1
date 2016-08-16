/*
 * En un curso se practican 4 evaluaciones con los siguientes porcentajes: 25%, 20%, 25% y
30%. Para cada estudiante se informa el código y las 4 notas. Hacer un programa que calcule
la nota definitiva de cada estudiante, el promedio de notas definitivas del curso y el
porcentaje de perdedores. Sugerencia: Asuma que el curso está compuesto por N
estudiantes, usted es libre de asignar el valor de N, 50 o 10 por ejemplo

 */
package pactica;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author SEBASTIAN
 */
public class pto12 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double[][] estudiante = new double[10][6];//columna 0.codigo, 1. parcial1(P1), 2. P2, 3.P3, 4. P4
        boolean i=true;                           //5. definitiva 
        int opcion=0,codigo=0;
        double promCurso=0, perdedores=0;
        while(i){
            System.out.println("El curso esta compuesto por 10 Estudiantes\n"+
                    "Ingrese una opcion\n0. Salir\n1. Ingresar Estudiantes\n2. Ver nota estudiante\n"
                    + "3. Ver estadistica\n");
            opcion= lector.nextInt();
            switch (opcion){
                case 0:
                    i=false;
                break;
                case 1:
                    System.out.println("Datos de los estudiantes\n");
                    for(int j=0;j<10;j++){
                        
                        System.out.println("Estudiante "+(j+1)+"\nCodigo: ");
                        estudiante[j][0]= lector.nextDouble();
                        
                        System.out.println("Nota 1: ");
                        estudiante[j][1]= lector.nextDouble();
                        
                        System.out.println("Nota 2: ");
                        estudiante[j][2]= lector.nextDouble();
                        
                        System.out.println("Nota 3: ");
                        estudiante[j][3]= lector.nextDouble();
                        
                        System.out.println("Nota 4: ");
                        estudiante[j][4]= lector.nextDouble();
                        
                        estudiante[j][5]=estudiante[j][1]*0.25+estudiante[j][2]*0.20+estudiante[j][3]*0.25+
                                            estudiante[j][4]*0.30;
                    }
                break;
                case 2:
                    System.out.println("Ingrese codigo de estudiante que desea ver notas: ");
                    codigo = lector.nextInt();
                    for(int j=0; j<10 ;j++){
                        if (codigo == estudiante[j][0]){
                            System.out.println("Estudiante "+ (j+1) +"\nCodigo: "+ codigo +
                                    "\nNota1: "+estudiante[j][1]+"\nNota2: "+estudiante[j][2]+
                                    "\nNota3: "+estudiante[j][3]+"\nNota4: "+estudiante[j][4]+
                                    "\nDefinitiva: "+ estudiante[j][5] + 
                                    "\n");
                            
                        }
                    }
                break;
                case 3://Promedio curso y %perdedores
                    for(int j=0; j<10 ;j++){
                        promCurso=promCurso+ estudiante[j][5];
                        if(estudiante[j][5] < (3.0)){
                            perdedores=perdedores+1;
                            
                        }
                        
                    }
                    promCurso=promCurso/10;
                    perdedores=(perdedores*100)/10;
                    System.out.println("El promedio del curso es: "+promCurso+"\nPerdedores: "+perdedores
                                        +" %");
                break;
                   
            }
        
        }
    }
}
