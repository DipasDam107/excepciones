/*
 Realiza una función/método que se le pase por parámetro una cadena que representa una dirección
de correo electrónico. En caso de que la cadena no cumpla las condiciones sintácticas de un email, se
generará una excepción de tipo: “Formato email inválido”. Los requisitos que tiene que tener una dirección
de email pueden ser: número mínino de caracteres=5, una arroba, un punto, texto entre arroba y punto y
entre punto y final de cadena, etc.)
    • En el tercer trimestre veremos las expresiones regulares que facilitan estas tareas de validación
    • Hacer un programa que llame a la función anterior y capture la excepción generada. 
 */
package dam107t6e8;

import java.util.Scanner;

public class Main {
    static Scanner teclado;
    public static void main(String [] args){
        try{
        teclado = new Scanner(System.in);
        System.out.println("Introduce email: ");
        String correo = teclado.nextLine();
        if(validarEmail(correo))
            System.out.println("Valido");
        
        }catch(formatoEmailInvalido e){
            System.out.println(e.getMessage());
        }catch(IndexOutOfBoundsException e){
            System.out.println("Indice incorrecto");
        }catch(Exception e){
            System.out.println("Se ha producido una excepcion");
            e.printStackTrace();
        }
    }
    
    public static boolean validarEmail(String correo) throws formatoEmailInvalido{
        boolean valido=false;
        if(correo.length()>=5){
            int pos = correo.indexOf('@');
            int posPunto = correo.indexOf('.');
            if(pos<posPunto &&(pos!=-1 && correo.indexOf('@', pos+1)==-1)&&(posPunto!=-1 && correo.indexOf('.', posPunto+1)==-1) ){
                if(correo.substring(pos, posPunto).length()>1 && correo.substring(posPunto, correo.length()).length()>1)
                    valido=true;
            }
        }
       if(!valido) throw new formatoEmailInvalido();
       return valido;
    }
}

class formatoEmailInvalido extends Exception{
    @Override
    public String getMessage(){
        return "Error en el formato del correo";
    }
}
