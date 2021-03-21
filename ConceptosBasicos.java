/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceptosbasicos;

import ico.fes.Automovil;
import java.awt.Color;

/**
 *
 * @author Puig
 */
public class ConceptosBasicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Automovil miBocho= new Automovil();
        miBocho.setMarca("VW");
        miBocho.setSubMarca("Sedan");
        miBocho.setModelo(1970);
        miBocho.setColor(Color.blue);
        System.out.println( miBocho );
        
        //TAREA.- progamar los objetos mi "Mi Acura" y "Mi Mustang"
        
        Automovil miAkura= new Automovil();
        miBocho.setMarca("Akura");
        miBocho.setSubMarca("NSX");
        miBocho.setModelo(2013);
        miBocho.setColor(Color.gray);
        System.out.println( miAkura );
        
        Automovil miMustang= new Automovil();
        miBocho.setMarca("FORD");
        miBocho.setSubMarca("Mustan");
        miBocho.setModelo(2010);
        miBocho.setColor(Color.yellow);
        System.out.println( miMustang );
        
    }
    
}
