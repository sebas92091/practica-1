/*
 * Implemente un programa utilizando clases que permite calcular el área de las siguientes
figuras trigonométricas: círculo, triangulo, cuadro y rectángulo. El programa debe visualizar
un menú para que el usuario seleccione la figura deseada, al entrar en dicho menú se solicitan
los datos necesarios al usuario para ejecutar el cálculo, después de esto debe volver al menú
inicial. 
 */
package pto14;
import java.util.Scanner;

/**
 *
 * @author SEBASTIAN
 */
public class principal {
    public static void main(String[] args) {
        int a,salir=0;
        Scanner lector=new Scanner(System.in);
        do{
            System.out.println("1.Circulo."
                    + "\n2.Cuadro."
                    + "\n3.Rectangulo."
                    + "\n4.Triangulo."
                    +"\n5.Salir.\n"
                    + "\nIngrese la opcion deseada: "); 
            a=lector.nextInt();
            switch (a){
                case 1:
                    double radio;
                    System.out.println("Ingrese el radio del circulo: ");
                    radio=lector.nextDouble();
                    System.out.println("Area Circulo: "+Circulo.Circulo(radio));  
                    break;
                case 2:
                    double lado;
                    Cuadro Resultado2=new Cuadro();
                    System.out.println("Ingrese el lado del cuadro: ");
                    lado=lector.nextDouble();
                    System.out.println("Area del Cuadro: "+Resultado2.Cuadro(lado));  
                    break;
                case 3:
                    double base, altura;
                    Rectangulo Resultado3=new Rectangulo();
                    System.out.println("Ingrese la base del rectangulo: ");
                    base=lector.nextDouble();
                    System.out.println("Ingrese la altura del rectangulo: ");
                    altura=lector.nextDouble();
                    System.out.println("Area del Rectangulo: "+Resultado3.Rectangulo(base,altura));  
                    break;
                case 4:
                    Triangulo Resultado4=new Triangulo();
                    System.out.println("Ingrese la base del triangulo: ");
                    base=lector.nextDouble();
                    System.out.println("Ingrese la altura del triangulo: ");
                    altura=lector.nextDouble();
                    System.out.println("Area del Triangulo: "+Resultado4.Triangulo(base,altura));  
                    break;
                case 5:
                    salir=1;
                    break;
                default:
                    System.out.println("Ingrese una opcion valida!");
                    break;

            }
        }while(salir!=1);
        
        
    }
}
