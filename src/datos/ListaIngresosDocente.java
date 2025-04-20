/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;
import entidades.IngresoDocente;
import java.io.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USUARIO
 */

public class ListaIngresosDocente {

    public void agregarIngreso(IngresoDocente ingreso) {
        ArrayList <IngresoDocente> lista = leerIngresos();
        lista.add(ingreso);
        guardarIngresos(lista);
    }

    public ArrayList<IngresoDocente> leerIngresos() {
        ArrayList<IngresoDocente> listaD = new ArrayList<>();
        File f = new File("Registro Docente.txt");
        if(!f.exists()) 
            return listaD;
        try(ObjectInputStream ingreso = new ObjectInputStream(new FileInputStream("Registro Docente.txt"))) {
            listaD = (ArrayList<IngresoDocente>)ingreso.readObject();
        }catch(IOException e) {
            System.out.println("Ha ocurrido un error en la lectura: " + e.getMessage());
        }catch(ClassNotFoundException e) {
            System.out.println("Ha ocurrido un error en la lectura: " + e.getMessage());
        }

        return listaD;
    }
    
    public void guardarIngresos(ArrayList<IngresoDocente> lista) {
        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Registro Docente.txt"))) {
            salida.writeObject(lista);
        } catch (IOException e) {
            System.out.println("❌ Error al guardar archivo: " + e.getMessage());
        }
    }

    
    public ArrayList<IngresoDocente> obtenerPorCodigo(String codigo) {
    ArrayList<IngresoDocente> resultados = new ArrayList<>();
    for (IngresoDocente ingreso : leerIngresos()) {
        if (ingreso.getCodigo().equalsIgnoreCase(codigo)) {
            resultados.add(ingreso);
        }
    }
    return resultados;
    }
    public boolean eliminarPorCodigo(String codigo) {
        ArrayList<IngresoDocente> lista = leerIngresos();
        boolean eliminado = false;

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getCodigo().equalsIgnoreCase(codigo)) {
                lista.remove(i);
                eliminado = true;
                break;
            }
        }

        if (eliminado) {
            guardarIngresos(lista);
        }

        return eliminado;
    }
    public DefaultTableModel getContenido() {
        DefaultTableModel modelo = new DefaultTableModel();
        String[] columnas = {"Nombres", "Apellidos", "DNI", "Edad", "Departamento", "Especialidad", "Codigo", "Tipo", "Fecha de Ingreso"};
        modelo.setColumnIdentifiers(columnas);

        ArrayList<IngresoDocente> lista = leerIngresos();
        for (IngresoDocente profesor : lista) {
            Object[] fila = new Object[columnas.length];
            fila[0] = profesor.getNombre();
            fila[1] = profesor.getApellido();
            fila[2] = profesor.getDni();
            fila[3] = profesor.getEdad();
            fila[4] = profesor.getDepartamento();
            fila[5] = profesor.getEspecialidad();
            fila[6] = profesor.getCodigo();
            fila[7] = profesor.getTipo();
            fila[8] = profesor.getFechaIngresoCorta();
            modelo.addRow(fila);
        }

        return modelo;
    }
}
