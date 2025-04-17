/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;
import java.io.*;
/**
 *
 * @author USER
 */
public class Estudiante implements Serializable{
    String nombre;
    String codigo;
    String escuela;

    public Estudiante(String nombre, String codigo, String escuela) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.escuela = escuela;
    }

    
    @Override
    public String toString() {
        return "Estudiante{" + "Nombres y apellidos=" + nombre + ", Codigo de matricula=" + codigo + ", "
                + "Escuela profesional=" + escuela + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getEscuela() {
        return escuela;
    }
}
