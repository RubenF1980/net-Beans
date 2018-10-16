package net.intergrupo.contacto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno37
 */
public class Contacto {
    
    private String nombre;
    private String telefono; 
    private String alias;
    private String apellidos;
    private static int numeroDeContactos=0;  //estatico se comparte con todos los objetos de la clase.Si cambio en uno cambia en todos.

    
    
    public static int getNumeroDeContactos() {
        return numeroDeContactos;
    }

    public static void setNumeroDeContactos(int numeroDeContactos) {
        Contacto.numeroDeContactos = numeroDeContactos;
    }
    
    

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    
    
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    //constructor
    public Contacto(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }
    
     
}
