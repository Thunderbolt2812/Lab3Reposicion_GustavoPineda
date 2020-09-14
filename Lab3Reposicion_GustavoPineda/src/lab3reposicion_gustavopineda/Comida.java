/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3reposicion_gustavopineda;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Comida extends Productos {
    private String tipo;
    private Date caducidad;

    public Comida() {
        super();
    }
    
    public Comida(String tipo, Date caducidad, String descripcion, String nombre, int precio) {
        super(descripcion, nombre, precio);
        this.tipo = tipo;
        this.caducidad = caducidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(Date caducidad) {
        this.caducidad = caducidad;
    }

    @Override
    public String toString() {
        return "Producto: "+tipo;
    }
    
    
}
