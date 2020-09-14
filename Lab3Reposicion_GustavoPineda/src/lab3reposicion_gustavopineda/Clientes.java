/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3reposicion_gustavopineda;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Clientes extends Personas {
    private int dinero;
    private ArrayList<Productos> carrito;

    public Clientes() {
        super();
    }

    public Clientes(int dinero, ArrayList<Productos> carrito, long id, String usuario, String contraseña, String correo, String nombreC, Date nacimiento) {
        super(id, usuario, contraseña, correo, nombreC, nacimiento);
        this.dinero = dinero;
        this.carrito = carrito;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public ArrayList<Productos> getCarrito() {
        return carrito;
    }

    public void setCarrito(ArrayList<Productos> carrito) {
        this.carrito = carrito;
    }

    @Override
    public String toString() {
        return "Cliente: "+super.getNombreC();
    }
           
}
