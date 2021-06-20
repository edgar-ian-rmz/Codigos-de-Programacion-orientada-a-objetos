/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.conjunto;

import ico.fes.componentes.CPU;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Teclado;

/**
 *
 * @author Puig
 */
public class Computadora {
    private int marca;
    private int modelo;
    private CPU cpu;
    private Mouse mouse;
    private Monitor monitor;
    private Teclado teclado;

    public Computadora() {
    }

    public Computadora(int marca, int modelo, CPU cpu, Mouse mouse, Monitor monitor, Teclado teclado) {
        this.marca = marca;
        this.modelo = modelo;
        this.cpu = cpu;
        this.mouse = mouse;
        this.monitor = monitor;
        this.teclado = teclado;
    }

    public int getMarca() {
        return marca;
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", modelo=" + modelo + ", cpu=" + cpu + ", mouse=" + mouse + ", monitor=" + monitor + ", teclado=" + teclado + '}';
    }
    
    
}
