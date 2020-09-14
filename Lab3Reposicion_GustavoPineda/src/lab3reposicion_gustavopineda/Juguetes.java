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
public class Juguetes extends Productos {
    private String descrip;

    public Juguetes() {
        super();
    }

    public Juguetes(String descrip, String descripcion, String nombre, int precio) {
        super(descripcion, nombre, precio);
        this.descrip = descrip;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    @Override
    public String toString() {
        return "Juguetes: "+super.getNombre();
    }
    
}
