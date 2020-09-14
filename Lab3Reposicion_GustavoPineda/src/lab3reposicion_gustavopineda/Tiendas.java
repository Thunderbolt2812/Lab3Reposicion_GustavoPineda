/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3reposicion_gustavopineda;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Tiendas extends Locales {
    private ArrayList<Ropa> lropa;
    private ArrayList<Juguetes> ljuguetes;

    public Tiendas() {
        super();
    }
    public Tiendas(ArrayList<Ropa> lropa, ArrayList<Juguetes> ljuguetes, String nombre, ArrayList<Empleados> empleados, ArrayList<Productos> inventario, Empleados gerente) {
        super(nombre, empleados, inventario, gerente);
        this.lropa = lropa;
        this.ljuguetes = ljuguetes;
    }

    public ArrayList<Ropa> getLropa() {
        return lropa;
    }

    public void setLropa(ArrayList<Ropa> lropa) {
        this.lropa = lropa;
    }

    public ArrayList<Juguetes> getLjuguetes() {
        return ljuguetes;
    }

    public void setLjuguetes(ArrayList<Juguetes> ljuguetes) {
        this.ljuguetes = ljuguetes;
    }

    @Override
    public String toString() {
        return "Tienda: "+super.getNombre();
    }
    
    
}
