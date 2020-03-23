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
    static _MasterMind2 master;
    static resultado2 resu;
    public static void main(String [] args){
        String numero;
        master = new _MasterMind2();
        teclado = new Scanner(System.in);
        do{
            try{
            
                System.out.println("Dime Numero: ");
                numero=teclado.nextLine();
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                resu = master.comprobar(numero);
                master.pintarConsola();

            }catch(tamanioIncorrectoExcepcion e){
                System.out.println(e.getMessage());
            }catch(valoresInvalidosExcepcion e){
                System.out.println(e.getMessage());
            }catch(valoresRepetidosExcepcion e){
                System.out.println(e.getMessage());
            }catch(Exception e){
                e.printStackTrace();
            }
         }while(resu == null || (!resu.sinMasTurnos && !resu.gano));
        
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("-------------------------------");
        System.out.println("SE ACABA EL JUEGO");
        if(resu.gano) System.out.println("HAS GANADO");
        else if(resu.sinMasTurnos) System.out.println("HAS AGOTADO LOS INTENTOS");
        System.out.println("-------------------------------");
    }
}
