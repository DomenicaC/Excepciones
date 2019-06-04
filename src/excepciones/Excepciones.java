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
public class Excepciones {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Persona persona = new Persona();
        DatosPersona datosP = new DatosPersona(persona);
        datosP.setVisible(true);
    }
    
}
