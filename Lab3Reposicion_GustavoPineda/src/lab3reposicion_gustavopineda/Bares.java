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
public class Bares extends Locales {
   private ArrayList<Empleados> le;
   private ArrayList<Comida> productos;
   private Comida descuento;

    public Bares() {
    }
    public Bares(ArrayList<Empleados> le, ArrayList<Comida> productos, Comida descuento, String nombre, ArrayList<Empleados> empleados, ArrayList<Productos> inventario, Empleados gerente) {
        super(nombre, empleados, inventario, gerente);
        this.le = le;
        this.productos = productos;
        this.descuento = descuento;
    }

    public ArrayList<Empleados> getLe() {
        return le;
    }

    public void setLe(ArrayList<Empleados> le) {
        this.le = le;
    }

    public ArrayList<Comida> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Comida> productos) {
        this.productos = productos;
    }

    public Comida getDescuento() {
        return descuento;
    }

    public void setDescuento(Comida descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "Bare: "+super.getNombre();
    }
    
   
}
