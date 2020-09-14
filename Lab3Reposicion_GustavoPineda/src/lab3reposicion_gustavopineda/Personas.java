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
public class Personas {
    private long id;
    private String usuario;
    private String contraseña;
    private String correo;
    private String nombreC;
    private Date nacimiento;

    public Personas() {
    }

    public Personas(long id, String usuario, String contraseña, String correo, String nombreC, Date nacimiento) {
        this.id = id;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.correo = correo;
        this.nombreC = nombreC;
        this.nacimiento = nacimiento;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    @Override
    public String toString() {
        return "Persona: "+usuario;
    }
    
    
}
