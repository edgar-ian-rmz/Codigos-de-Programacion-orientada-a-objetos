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
public class Profesor extends Persona {
    private String cerrera;
    private int auntiguedad;

    public Profesor() {
    }

    public Profesor(String cerrera, int auntiguedad) {
        this.cerrera = cerrera;
        this.auntiguedad = auntiguedad;
    }

    public Profesor(String cerrera, int auntiguedad, String nombre, int edad) {
        super(nombre, edad);
        this.cerrera = cerrera;
        this.auntiguedad = auntiguedad;
    }

    public int getAuntiguedad() {
        return auntiguedad;
    }

    public void setAuntiguedad(int auntiguedad) {
        this.auntiguedad = auntiguedad;
    }

    public String getCerrera() {
        return cerrera;
    }

    public void setCerrera(String cerrera) {
        this.cerrera = cerrera;
    }

    @Override
    public String toString() {
        return super.toString() + "Profesor{" + "cerrera=" + cerrera + ", auntiguedad=" + auntiguedad + '}';
    }
    public void asistir(){
            System.out.println("Checando la entrada en sala de firmas");
    }
    public void dictarclase(){
        System.out.println("Enseñando programacion en la sala de computo");
    }
}
