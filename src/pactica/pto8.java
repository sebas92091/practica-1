/*
 * 8. Escribir un programa utilizando la estructura Switch, que reciba dos números de dos cifras,
tome el primer número digitado y dependiendo del valor del último digito haga:
0: Diga cuál es mayor           5: Calcule la división
1: Diga cuál es menor           6: Diga si el primero es divisible por el segundo
2: Calcule la suma              7: Diga si el segundo es divisible por el prime
3: Calcule la resta             8: calcule la raíz cuadrada del primer número
4: Calcule la multiplicación    9: Imprima en pantalla “Que punto tan fácil
 parce…”
 */
package pactica;

import java.util.Scanner;

/**
 *
 * @author SEBASTIAN
 */
public class pto8 {
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        
        double num1,num2,  aux;
        int operacion;
        System.out.print("Ingrese numero 1: ");
        num1 =lector.nextInt();
        
        System.out.print("Ingrese numero 2: ");
        num2 =lector.nextInt();
        
        operacion= (int)num1%10;
        
        switch(operacion){
            case 0:
                if(num1 > num2)
                    System.out.println("Numero1("+num1+") mayor que numero2("+num2+")");
                else
                    System.out.println("Numero2("+num2+") mayor que numero1("+num1+")");
            break;
            
            case 1:
                if(num1 > num2)
                    System.out.println("Numero2("+num2+") menor que numero1("+num1+")");
                else
                    System.out.println("Numero1("+num1+") menor que numero2("+num2+")");
            break;
            
            case 2:
                aux= num1+num2;
                System.out.println("num1+num2= "+aux);                
            break;
            
            case 3:
                aux=num1-num2;
                 System.out.println("num1-num2= "+aux);   
            break;
            
            case 4:
                aux=num1*num2;
                System.out.println("num1*num2= "+aux); 
            break;
            
            case 5:
                aux=num1/num2;
                System.out.println("num1/num2= "+aux);
            break;
            
            case 6:
                aux= num1%num2;
                if (aux==0)
                    System.out.println("num1 es divisible´por num2 ");
                else
                    System.out.println("num1 no es divisble por num2 ");
            break;
            
            case 7:
                aux= num2%num1;
                if (aux==0)
                    System.out.println("num2 es divisible´por num1 ");
                else
                    System.out.println("num2 no es divisble por num1 ");
            break;
            
            case 8:
                aux=Math.sqrt(num1);
                System.out.println("La raiz de num1 es: "+aux);
            break;
            
            case 9:
                System.out.println("Que punto tan fácil parce");
            break;
            
            default:
            break;
        }
    }
}
