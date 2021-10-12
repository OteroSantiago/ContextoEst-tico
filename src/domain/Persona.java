/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Santiago
 */
public class Persona {
    //Atributos
    private int idPersona;//Contiene un identificador unico para cada persona
    private String nombre;
    private static int contPersonas;//Se incrementará en el constructor
    //constructor
    public Persona(String nombre) {
        this.nombre = nombre;
        Persona.contPersonas++;
        //Asignamos el nuevo valor al idPersona
        this.idPersona = Persona.contPersonas;
    }
    //getters and setters
    public int getIdPersona() {
        return idPersona;
    }
    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public static int getContPersonas() {
        return contPersonas;
    }
    public static void setContPersonas(int contPersonas) {
        Persona.contPersonas = contPersonas;
    }
    //toString

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }
    
    
    
    
}
