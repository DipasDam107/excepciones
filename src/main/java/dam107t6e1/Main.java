/* CUESTION 1
 Scanner teclado = new Scanner(System.in);
 System.out.print("Num 1: ");int num1 = teclado.nextInt();
 System.out.print("Num 2: ");int num2 = teclado.nextInt();
 System.out.println("div=" + num1 / num2); 

 ¿Puede finalizar abruptamente esta porción de código? 
    Efectivamente. Tanto si la división es por cero, como si se introduce un input no valido.
    Para  Que funcione correctamente habría que capturar ambas excepciones.

    public class Main {
    public static void main(String[]args){
        try{
            Scanner teclado = new Scanner(System.in);
            System.out.print("Num 1: ");int num1 = teclado.nextInt();
            System.out.print("Num 2: ");int num2 = teclado.nextInt();
            System.out.println("div=" + num1 / num2); 
        }catch(ArithmeticException e){
            System.out.println("Error. Division por cero");
        }
        catch(InputMismatchException e){
            System.out.println("Error en la entrada de datos");
        }
    }
}
    
}

  CUESTION 2
    int [] a = new int [] {1,2,3,4,5};
    int p = -1;
    try { System.out.print(a[p]); }
    catch (ArrayIndexOutOfBoundsException e ) {System.out.print("0"); }

  ¿Qué muestra este código? ¿Finaliza el programa abruptamente? 
    Muestra 0, ya que -1 no es una posicion válida y ejecuta el catch de la excepcion. No finaliza abruptamente, la excepcion está controlada.

    EJERCICIO
Haz un programa que solicite al usuario dos números enteros y los intente dividir (división entera,
sin decimales). Si el denominador es cero, deberá capturar la excepción y decir que el resultado de la
división es cero, sin que el programa pare su ejecución abruptamente.
Nota: para provocar la excepción, hacemos la división de enteros, sin casting: double res=num1
/num2; con num2=0. Si hiciésemos el casting: double res = (double) num1 / num2; no se produce la
excepción, informa que el resultado es ‘Infinity’. 
*/
package dam107t6e1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        try{
            Scanner teclado = new Scanner(System.in);
            System.out.print("Num 1: ");int num1 = teclado.nextInt();
            System.out.print("Num 2: ");int num2 = teclado.nextInt();
            System.out.println("div=" + num1 / num2); 
        }catch(ArithmeticException e){
            System.out.println("Error. Division por cero");
        }
        catch(InputMismatchException e){
            System.out.println("Error en la entrada de datos");
        }
    }
}
