/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam107t6e9;

/**
 *
 * @author User
 */
public class valoresInvalidosExcepcion extends Exception{
    @Override
    public String getMessage(){
        return "Los valores Introducidos no son validos";
    }
}
