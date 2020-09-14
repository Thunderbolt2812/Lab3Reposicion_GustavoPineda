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
public class Productos {
    private String descripcion;
    private String nombre;
    private int precio;

    public Productos() {
    }

    public Productos(String descripcion, String nombre, int precio) {
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Productos: " + nombre;
    }
    
    
}
