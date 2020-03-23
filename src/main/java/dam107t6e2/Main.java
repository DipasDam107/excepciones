/*
 Haz un programa que solicite al usuario dos números double y los intente sumar. En caso de que
se introduzcan valores que no son enteros, por ejemplo, textos no numéricos, no provocará un error en
tiempo de ejecución, simplemente informará de que se ha producido un error y no mostrará el resultado
de la suma. 
 */
package dam107t6e2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        double num1, num2;
        Scanner teclado = new Scanner(System.in);
        try{
            System.out.println("Introduce dividendo: ");
            num1=teclado.nextDouble();
            System.out.println("Introduce divisor: ");
            num2=teclado.nextDouble();
            System.out.println("El resultado de la operación es : " + (num1/num2));
        }catch(InputMismatchException e){
            System.out.println("Los valores introducidos no son correctos");
        }
        
    }
}
