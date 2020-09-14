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
public class Locales {
    private String nombre;
    private ArrayList<Empleados>empleados;
    private ArrayList<Productos>inventario;
    private Empleados gerente;

    public Locales() {
    }

    public Locales(String nombre, ArrayList<Empleados> empleados, ArrayList<Productos> inventario, Empleados gerente) {
        this.nombre = nombre;
        this.empleados = empleados;
        this.inventario = inventario;
        this.gerente = gerente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Empleados> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleados> empleados) {
        this.empleados = empleados;
    }

    public ArrayList<Productos> getInventario() {
        return inventario;
    }

    public void setInventario(ArrayList<Productos> inventario) {
        this.inventario = inventario;
    }

    public Empleados getGerente() {
        return gerente;
    }

    public void setGerente(Empleados gerente) {
        this.gerente = gerente;
    }

    @Override
    public String toString() {
        return "Local: "+nombre;
    }
    
    
}
