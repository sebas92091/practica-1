/*
 * Una oficina de seguros ha reunido datos concernientes a todos los accidentes de tránsito
ocurridos en el área metropolitana en el último año. Por cada conductor involucrado en un
accidente se toman los siguientes datos: año de nacimiento, sexo (1: Femenino, 2: Masculino),
registro del carro (1: Medellín, 2: Otras ciudades). Hacer un programa en java que muestre:
a) El porcentaje de conductores menores de 25 años
b) El porcentaje de conductores del sexo femenino.
c) El Porcentaje de conductores cuyos carros están registrados fuera de Medellín.

 */
package pactica;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author SEBASTIAN
 */
public class pto7 {
    
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        boolean i=true;
        int opcion;
        double calculo=0.0;
        
        ArrayList<Integer> nacimiento = new ArrayList();
        ArrayList<Integer> sexo = new ArrayList();
        ArrayList<Integer> registro = new ArrayList();
        
        while(i){
            System.out.print("\n\nElija alguna opcion\n0. Salir\n1. Ingresar conductor \n2. Ver estadisticas \n");
            opcion = lector.nextInt();
            switch (opcion){
                case 1:
                    System.out.print("1. Año de nacimiento: "); 
                    nacimiento.add(lector.nextInt());
                    System.out.print("2. sexo (1: Femenino, 2: Masculino): "); 
                    sexo.add(lector.nextInt());
                    System.out.print("3. registro del carro (1: Medellín, 2: Otras ciudades): "); 
                    registro.add(lector.nextInt());
                    break;
                case 2:
                    // calculo menores de 25
                    for(int j=0;j<nacimiento.size();j++){
                        if(nacimiento.get(j) > 1991 ){
                            calculo++;
                        }
                    }
                    calculo = calculo*100;
                    calculo = calculo/nacimiento.size();
                    System.out.println("Conductores menores de 25 años: "+calculo+" %");
                    calculo=0;
                    //calculo mujeres
                    for(int j=0; j<sexo.size();j++){
                        if (sexo.get(j) == 1){
                            calculo++;
                        }
                    }
                    calculo = calculo*100;
                    calculo = calculo/nacimiento.size();
                    System.out.println("Mujeres: "+calculo+" %");
                    calculo=0;
                    //calculo registrados fuera de Medellín
                    for(int j=0; j<registro.size();j++){
                        if (registro.get(j) == 2){
                            calculo++;
                        }
                    }
                    calculo = calculo*100;
                    calculo = calculo/nacimiento.size();
                    System.out.println("Registrados fuera de Medellín: "+calculo+" %");
                break;
                    
                case 0: 
                    i=false;
                break;
                
                        
            }       
        }
   }
}
