/*
Haz un programa que solicite al usuario dos números enteros y los intente dividir (división entera,
sin decimales). Si se produce algún error el programa no finalizará de forma abrupta si no que capturará
la excepción ocurrida: o bien entrada de valores incorrectos o bien por división por cero, informando al
usuario de lo que ha acontecido. Finalmente, mostrará el resultado de la división, que será cero en caso
de cualquiera de los dos errores posibles. 

 */
package dam107t6e3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        try{
            Scanner teclado = new Scanner(System.in);
            System.out.print("Num 1: ");int num1 = teclado.nextInt();
            System.out.print("Num 2: ");int num2 = teclado.nextInt();
            System.out.println("Resultado = " + (num1 / num2)); 
        }catch(ArithmeticException e){
            System.out.println("Error. Division por cero. Resultado = 0");
        }
        catch(InputMismatchException e){
            System.out.println("Error en la entrada de datos. Resultado = 0");
        }
    }
}
