/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;
import java.io.Serializable;
/**
 *
 * @author USUARIO
 */

public class IngresoProfesor implements Serializable {
    private final String nombre;
    private final String dni;
    private final String codigo;
    private final int edad;
    private final String especialidad;
    private final String fechaIngreso;
    private final String horaIngreso;

    public IngresoProfesor(String nombre, String dni, String codigo, int edad, String especialidad, String fechaIngreso, String horaIngreso) {
        this.nombre = nombre;
        this.dni = dni;
        this.codigo = codigo;
        this.edad = edad;
        this.especialidad = especialidad;
        this.fechaIngreso = fechaIngreso;
        this.horaIngreso = horaIngreso;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getEdad() {
        return edad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public String getHoraIngreso() {
        return horaIngreso;
    }

    @Override
    public String toString() {
        return "IngresoProfesor{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", codigo='" + codigo + '\'' +
                ", edad=" + edad +
                ", especialidad='" + especialidad + '\'' +
                ", fechaIngreso='" + fechaIngreso + '\'' +
                ", horaIngreso='" + horaIngreso + '\'' +
                '}';
    }
}
