/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3reposicion_gustavopineda;

/**
 *
 * @author Usuario
 */
public class Ropa extends Productos {
    private String genero;
    private String talla;

    public Ropa() {
        super();
    }
    public Ropa(String genero, String talla, String descripcion, String nombre, int precio) {
        super(descripcion, nombre, precio);
        this.genero = genero;
        this.talla = talla;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    @Override
    public String toString() {
        return "Ropa: "+"Genero:"+genero+"-"+"Talla: "+talla;
    }
    
    
}
