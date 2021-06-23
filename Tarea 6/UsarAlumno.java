/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.herencia;

/**
 *
 * @author Puig
 */
public class UsarAlumno {
    public static void main(String[] args){
        Alumno a=new Alumno("99554555", "ICO", 2, "Pedro", 18, 1, 1.83f);
        
        System.out.println("Nombre" + a.getNombre());
        
    }
}
