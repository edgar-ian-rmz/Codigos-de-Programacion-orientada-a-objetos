/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.objetos;

import java.awt.Color;

/**
 *
 * @author Puig
 */
public class PuerteDeSeguridad extends Puerta {
    private String mecanismo;
    private String contrasenia;

    public PuerteDeSeguridad() {
    }

    public PuerteDeSeguridad(String mecanismo, String contrasenia) {
        this.mecanismo = mecanismo;
        this.contrasenia = contrasenia;
    }

    public PuerteDeSeguridad(String mecanismo, String contrasenia, String material, Color color, boolean conVidrio) {
        super(material, color, conVidrio);
        this.mecanismo = mecanismo;
        this.contrasenia = contrasenia;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getMecanismo() {
        return mecanismo;
    }

    public void setMecanismo(String mecanismo) {
        this.mecanismo = mecanismo;
    }

    @Override
    public String toString() {
        return super.toString() + "PuerteDeSeguridad{" + "mecanismo=" + mecanismo + ", contrasenia=" + contrasenia + '}';
    }
    public boolean verificar(){
        System.out.println("Verificando...");
        return this.contrasenia  !=null;
        
    }
    
    
}
