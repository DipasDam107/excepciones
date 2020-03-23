/*
 Modificar la clase MasterMind2 entregada por el profesor, para que si el número ingresado por el
usuario (cada intento) no cumple alguno de los requisitos, genere una excepción. Habrá una excepción
“Tamaño incorrecto” si no tiene 4 posiciones, “Valores inválidos” si tiene caracteres no numéricos y una
tercera excepción “Valores repetidos” si contiene algún dígito repetido.

Ejecuta el programa entregado por el profesor, que hace uso de esta clase, y provoca las
excepciones propuestas para ver su funcionamiento. A continuación, modifícalo para que capture
estas excepciones sin producir una salida abrupta del programa. 
 */
package dam107t6e9;

import java.util.Scanner;

public class Main {
    static Scanner teclado;
    public static void main(String [] args){
        teclado = new Scanner(System.in);
    }
}
