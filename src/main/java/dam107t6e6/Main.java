/*
    Crear una función leerEntero(int max, int min) que solicite al usuario la entrada de un número
    entero y que valide que es un valor entero y que está comprendido entre los parámetros max y min (esto
    es, mayor o igual que min y menor o igual que max). El usuario deberá repetir la entrada de datos hasta
    que lo haga bien, devolviendo finalmente la función el valor introducido y validado.
 */
package dam107t6e6;

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
            numero=leerEntero(Math.min(num1, num2), Math.max(num1, num2));
            if(valido) System.out.println("Valor "+ numero +" correcto");
            else System.out.println("Valor "+ numero +" incorrecto");
        }catch(InputMismatchException e){
            System.out.println("\n\n\n\n\n\n\n\n\n\nDatos introducidos incorrectos");
            teclado.nextLine();
            valido=false;
        }
        }while(!valido);
    }
   
    public static int leerEntero(int min, int max){
        System.out.println("Introduce Valor: ");
        int numero = teclado.nextInt();
        if(numero>=min && numero<=max)
            valido=true; 
        else
            valido=false;
              
        return numero;
    }
}
