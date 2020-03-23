/*
 Añadir a la función anterior un parámetro de texto de ayuda, para saber lo que tiene que introducir
el usuario. Así nos evitamos el System.out.print previo a las lecturas de teclado. Ejemplo:
int edad = leerEntero (“Introduzca su edad”, 0, 120); 

 */
package dam107t6e7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner teclado;
    static boolean valido;
    public static void main(String [] args){
        teclado = new Scanner(System.in);
        int num1, num2,numero=0;
        do{
        try{
            System.out.println("Introduce limite: ");
            num1=teclado.nextInt();
            teclado.nextLine();
            System.out.println("Introduce limite: ");
            num2=teclado.nextInt();
            teclado.nextLine();
            numero=leerEntero("Introduce la edad: ", Math.min(num1, num2), Math.max(num1, num2));
            if(valido) System.out.println("Valor "+ numero +" correcto");
            else System.out.println("Valor "+ numero +" incorrecto");
        }catch(InputMismatchException e){
            System.out.println("\n\n\n\n\n\n\n\n\n\nDatos introducidos incorrectos");
            teclado.nextLine();
            valido=false;
        }
        }while(!valido);
    }
   
    public static int leerEntero(String cadena, int min, int max){
        System.out.println(cadena);
        int numero = teclado.nextInt();
        if(numero>=min && numero<=max)
            valido=true; 
        else
            valido=false;
              
        return numero;
    }
}
