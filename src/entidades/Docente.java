/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Administrador
 */
public class Docente extends Persona{
    private String departamento;
    private String tipo;
    
    public Docente () {
        this("ND","NT");
    }
    
    public Docente(String departamento,String tipo) {
        this.departamento = departamento;
        this.tipo = tipo;
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
