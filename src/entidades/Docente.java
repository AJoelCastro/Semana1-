/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.*;

/**
 *
 * @author Administrador
 */
public class Docente extends Persona implements Serializable{
    private String departamento;
    private String especialidad;
    private String codigo;
    private String tipo;
    
    public Docente () {
        this("ND","NT","NE","NE");
    }
    
    public Docente(String departamento,String tipo,String especialidad,String codigo) {
        this.departamento = departamento;
        this.codigo = codigo;
        this.tipo = tipo;
        this.especialidad = especialidad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public String toString() {
        return "\n\t" + super.toString() + "Departamento: " + getDepartamento() + 
                "Tipo de Docente: " + getTipo();
    } 
    
        
}
