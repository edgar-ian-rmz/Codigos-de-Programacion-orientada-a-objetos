/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetocomputadora;

import ico.fes.componentes.CPU;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Teclado;
import ico.fes.conjunto.Computadora;

/**
 *
 * @author Puig
 */
public class ObjetoComputadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Computadora computadoraGamer = new Computadora();
        computadoraGamer.setCpu(new CPU ("Shitake2" ,"A10", 3));
        computadoraGamer.setMouse(new Mouse("G3K","hp","inalambrico"));
        computadoraGamer.setMonitor(new Monitor("SAMSUNG", "LS27AM500NLXZX", 27));
        computadoraGamer.setTeclado(new Teclado("HyperX", "G203", 117, 6));
        
        System.out.println(computadoraGamer);
        computadoraGamer.getMouse().setTipo("alambrico");
        System.out.println(computadoraGamer);
        
    }
    
}
