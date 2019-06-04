/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author Domenica Cañizares
 */
public class ValidarCedula extends Exception{

    public ValidarCedula() {
         super("La cedula no es correcta");
    }
    
}
