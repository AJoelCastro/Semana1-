/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Administrador
 */
public abstract class Persona {
    private String nombre;
    private String apellido;
    private String dni;
    private String edad;

    public Persona() {
        this("NN", "NA","ND","SE");
    }

    public Persona(String nombre, String apellido, String dni,String edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }
    
    public void setDni(String Dni) {
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
    
    @Override
    public String toString() {
        return getNombre() + " " + getApellido() + " " + 
                getDni() + " " + getEdad();
    }
}
