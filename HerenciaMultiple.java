/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciamultiple;

import ico.fes.programacion.ProfesorDeProgramacion;

/**
 *
 * @author Puig
 */
public class HerenciaMultiple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProfesorDeProgramacion profe= new ProfesorDeProgramacion(20, "Java");
        profe.comer();
        profe.asistir();
        profe.dictarClase();
        profe.probarCodigo();
        profe.programar();
        System.out.println(profe);
        
    }
    
}
