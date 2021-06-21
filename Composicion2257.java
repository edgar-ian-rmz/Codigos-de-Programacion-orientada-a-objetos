/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicion2257;

import ico.fes.objetos.Puerta;
import ico.fes.objetos.PuerteDeSeguridad;
import ico.fes.objetos.Ventana;
import ico.fes.partes.Muro;
import java.awt.Color;

/**
 *
 * @author Puig
 */
public class Composicion2257 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Muro muroNorte=new Muro();
        muroNorte.setPuerta(new Puerta("Madera", Color.white, true));
        Ventana[] tpmVentanas = new Ventana[2];
        tpmVentanas[0]=new Ventana("Madera", Color.yellow, 0.5f, 1.0f);
        tpmVentanas[0]=new Ventana("Madera", Color.green, 0.5f, 1.0f);
        muroNorte.setVentanas(tpmVentanas);
        
        System.out.println( muroNorte);
        System.out.println( muroNorte.getVentanas()[0]);
        System.out.println( muroNorte.getVentanas()[1]);
        muroNorte.getPuerta().setMaterial("Aluminio");
        System.out.println( muroNorte);
        muroNorte.getVentanas()[1].setMaterial("Aluminio");
        System.out.println( muroNorte.getVentanas()[1]);
        
        System.out.println("--------Ejemplos de herencia---------");
        PuerteDeSeguridad puer1=new PuerteDeSeguridad();
        puer1.abrir();
        puer1.cerrar();
        puer1.setColor(Color.gray);
        System.out.println("La puerta de seg. es de color:" + puer1.getColor() );
        
        PuerteDeSeguridad puer2=new PuerteDeSeguridad("chapa electronica", "1234dios", "metal", Color.gray, false);
        
        System.out.println(puer2.toString());
                
    }
    
}