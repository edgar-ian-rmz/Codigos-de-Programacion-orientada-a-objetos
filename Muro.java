/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.partes;

import ico.fes.objetos.Puerta;
import ico.fes.objetos.Ventana;
import java.awt.Color;

/**
 *
 * @author Puig
 */
public class Muro {
    private float largo;
    private float ancho;
    private float alto;
    private Color color;
    private Puerta puerta;  //si es igual a nule significa que no tiene puerta
    private Ventana []Ventanas; // de 0 a N ventanas.

    public Muro() {
    }

    public Muro(float largo, float ancho, float alto, Color color, Puerta puerta, Ventana[] Ventanas) {
        this.largo = largo;
        this.ancho = ancho;
        this.alto = alto;
        this.color = color;
        this.puerta = puerta;
        this.Ventanas = Ventanas;
    }

    public Ventana[] getVentanas() {
        return Ventanas;
    }

    public void setVentanas(Ventana[] Ventanas) {
        this.Ventanas = Ventanas;
    }

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getAlto() {
        return alto;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Puerta getPuerta() {
        return puerta;
    }

    public void setPuerta(Puerta puerta) {
        this.puerta = puerta;
    }

    @Override
    public String toString() {
        return "Muro{" + "largo=" + largo + ", ancho=" + ancho + ", alto=" + alto + ", color=" + color + ", puerta=" + puerta + ", Ventanas=" + Ventanas + '}';
    }
    
    public void tirar(){
        System.out.println("tirando la pared");
    }
}
