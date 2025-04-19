/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;
import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 *
 * @author USUARIO
 */

public class IngresoDocente extends Persona implements Serializable {
    private String codigo;
    private String departamento;
    private String tipo;
    private String especialidad;
    private GregorianCalendar fechaIngreso;

    public IngresoDocente(String tipo,String departamento,String codigo, String especialidad, 
            String nombre, String apellido, String dni, String edad, GregorianCalendar fechaIngreso) {
        super(nombre, apellido, dni, edad);
        this.departamento = departamento;
        this.codigo = codigo;
        this.tipo = tipo;
        this.especialidad = especialidad;
        this.fechaIngreso = fechaIngreso;
    }


    // Getters
    public String getDepartamento() {
            return departamento;
        }

    public String getCodigo() {
        return codigo;
    }

    public String getTipo() {
        return tipo;
    }
    
    public String getEspecialidad() {
        return especialidad;
    }

    public String getFechaIngresoCorta() {
        int dia, mes, año;
        dia = fechaIngreso.get(Calendar.DAY_OF_MONTH);
        mes = fechaIngreso.get(Calendar.MONTH)+1;
        año = fechaIngreso.get(Calendar.YEAR);
        return (dia<=9?"0"+dia:dia) + "/" + (mes<=9?"0"+mes:mes) + "/" + año;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setFechaIngreso(int dia, int mes, int año) {
        fechaIngreso = new GregorianCalendar(año, mes-1, dia);
    }
    
    @Override
    public String toString() {
        return "IngresoProfesor{" +
                ", codigo='" + codigo + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", fechaIngreso='" + fechaIngreso + '\'' +
                '}';
    }
}
