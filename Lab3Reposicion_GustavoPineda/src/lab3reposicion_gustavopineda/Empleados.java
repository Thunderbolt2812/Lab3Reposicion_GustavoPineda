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
public class Empleados extends Personas {
    private String horario;
    private int ventas;

    public Empleados() {
        super();
    }

    public Empleados(String horario, int ventas, long id, String usuario, String contraseña, String correo, String nombreC, Date nacimiento) {
        super(id, usuario, contraseña, correo, nombreC, nacimiento);
        this.horario = horario;
        this.ventas = ventas;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    @Override
    public String toString() {
        return "Empleado: "+super.getNombreC();
    }
    
}
