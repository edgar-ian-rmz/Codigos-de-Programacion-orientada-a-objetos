/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.programacion;

/**
 *
 * @author Puig
 */
public class ProfesorDeProgramacion extends Persona implements Programador {
    private int añosExperiencia;
    private String lenguajeDeProgramacion;

    public ProfesorDeProgramacion() {
    }

    public ProfesorDeProgramacion(int añosExperiencia, String lenguajeDeProgramacion) {
        this.añosExperiencia = añosExperiencia;
        this.lenguajeDeProgramacion = lenguajeDeProgramacion;
    }

    public ProfesorDeProgramacion(int añosExperiencia, String lenguajeDeProgramacion, String nombre, int edad) {
        super(nombre, edad);
        this.añosExperiencia = añosExperiencia;
        this.lenguajeDeProgramacion = lenguajeDeProgramacion;
    }

    public String getLenguajeDeProgramacion() {
        return lenguajeDeProgramacion;
    }

    public void setLenguajeDeProgramacion(String lenguajeDeProgramacion) {
        this.lenguajeDeProgramacion = lenguajeDeProgramacion;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    @Override
    public String toString() {
        return super.toString() + "ProfesorDeProgramacion{" + "a\u00f1osExperiencia=" + añosExperiencia + ", lenguajeDeProgramacion=" + lenguajeDeProgramacion + '}';
    }

    @Override
    public int programar() {
        System.out.println("Programando en" + this.lenguajeDeProgramacion);
        return 2;
    }

    @Override
    public void probarCodigo() {
        System.out.println("Probando programas en" + this.lenguajeDeProgramacion);
    }

    public void asistir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void dictarClase() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
