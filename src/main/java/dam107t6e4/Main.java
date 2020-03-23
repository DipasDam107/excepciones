/*
 Haz un programa que tenga definido un Array de 7 posiciones de double que representa la
temperatura media en una ciudad durante una semana (puedes generar valores al azar entre 0 y 40 para
llenarlo). Se le solicitará al usuario que introduzca dos posiciones, y calculará la temperatura media entre
esos días del año. Si los valores introducidos no son válidos, por estar fuera de los límites del array se
capturará la excepción y la media será cero. 
 */
package dam107t6e4;

import java.util.Scanner;

public class Main {
    static double[] array;
    static double resultado;
    public static void main(String [] args){
        try{
            Scanner teclado = new Scanner(System.in);
            int pos1, pos2;
            array = new double[7];
            llenarArray();
            System.out.println("Dime posicion:");
            pos1=teclado.nextInt();
            System.out.println("Dime posicion:");
            pos2=teclado.nextInt();
            resultado = hacerMedia(pos1, pos2); 
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("El rango no es valido");
            resultado=0;
            
        }
        catch(numIgualExcepcion e){
            System.out.println(e.getMessage());
            resultado=0;
        }
        finally{
            System.out.println("Resultado: " + resultado);
        }
         
        
    }
   
    public static void llenarArray(){
        for (int i = 0; i < array.length; i++) {
            array[i]= (Math.random()*41);
        }
    }
    
    public static double hacerMedia(int pos1, int pos2) throws numIgualExcepcion{
        if(pos1==pos2) throw new numIgualExcepcion();
        else{
            double total = 0;
            int cont=0;
            int inicio=Math.min(pos1, pos2);
            int fin=Math.max(pos1, pos2);
             
            for (int i = inicio; i <= fin; i++) {
                total +=array[i];
                cont++;
            } 
            return total/cont;
        }
        
    }
}
  class numIgualExcepcion extends Exception{
        @Override
        public String getMessage(){
            return "Error. Los numeros no pueden ser iguales";
        }
    }