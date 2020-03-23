/*
 Haz un programa que, desde el main(), solicite al usuario que introduzca tres enteros,
correspondientes a día, mes y año de una fecha. Realiza una función llamada validarFecha() que reciba
esos tres valores e intentar construir una fecha con LocalDate.of devolviendo true si la fecha es válida o
false si la fecha es inválida, es decir si se produce una excepción al construirla.
    • En caso de que los valores introducidos no sean enteros, el main() avisará de tal situación
    capturando la excepción en tipos de datos incorrectos al hacer el nextInt().
    • Si la función no es capaz de crear la fecha porque los valores no se corresponden con valores
    válidos, capturará esa excepción. Así pues, habrá un try…catch en el main() y otro en la función. 
 */
package dam107t6e5;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        int dia, mes, anio;
        try{
            System.out.println("Dime dia: ");
            dia=teclado.nextInt();
            System.out.println("Dime mes: ");
            mes=teclado.nextInt();
            System.out.println("Dime año: ");
            anio=teclado.nextInt();
            boolean valida=validarFecha(dia,mes,anio);
            if(valida)System.out.println("Fecha Valida");
            
        }catch(InputMismatchException e){
            System.out.println("Datos introducidos incorrectos");
        }
        }
    public static boolean validarFecha(int dia, int mes, int anio){
        try{
            LocalDate.of(anio, mes, dia);
            return true;
        }catch(DateTimeException e){
            System.out.println("Error al construir fecha");
            return false;
        }
    }
}
