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
public class Quioscos extends Locales {
    private String nombreq;
    private Comida pcomida;
    private Ropa propa;
    private Juguetes pjuguete;

    public Quioscos() {
    }

    public Quioscos(String nombreq, Comida pcomida, Ropa propa, Juguetes pjuguete, String nombre, ArrayList<Empleados> empleados, ArrayList<Productos> inventario, Empleados gerente) {
        super(nombre, empleados, inventario, gerente);
        this.nombreq = nombreq;
        this.pcomida = pcomida;
        this.propa = propa;
        this.pjuguete = pjuguete;
    }

    public String getNombreq() {
        return nombreq;
    }

    public void setNombreq(String nombreq) {
        this.nombreq = nombreq;
    }

    public Comida getPcomida() {
        return pcomida;
    }

    public void setPcomida(Comida pcomida) {
        this.pcomida = pcomida;
    }

    public Ropa getPropa() {
        return propa;
    }

    public void setPropa(Ropa propa) {
        this.propa = propa;
    }

    public Juguetes getPjuguete() {
        return pjuguete;
    }

    public void setPjuguete(Juguetes pjuguete) {
        this.pjuguete = pjuguete;
    }

    @Override
    public String toString() {
        return "Quiosco: "+super.getNombre();
    }
    
    
}
