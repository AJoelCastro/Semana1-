/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;
import entidades.IngresoDocente;
import java.io.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;

/**
 * Clase encargada de gestionar los ingresos de docentes.
 * Permite agregar, leer, buscar, eliminar y mostrar los registros de docentes en una tabla.
 */
public class ListaIngresosDocente {

    // Agrega un nuevo registro de ingreso docente al archivo
    public void agregarIngreso(IngresoDocente ingreso) {
        ArrayList<IngresoDocente> lista = leerIngresos(); // Leer registros actuales
        lista.add(ingreso); // Agregar el nuevo ingreso a la lista
        guardarIngresos(lista); // Guardar la lista actualizada
    }

    // Lee todos los ingresos de docentes desde el archivo "Registro Docente.txt"
    public ArrayList<IngresoDocente> leerIngresos() {
        ArrayList<IngresoDocente> listaD = new ArrayList<>();
        File f = new File("Registro Docente.txt");

        if (!f.exists()) 
            return listaD; // Si el archivo no existe, retorna lista vacía

        try (ObjectInputStream ingreso = new ObjectInputStream(new FileInputStream("Registro Docente.txt"))) {
            // Leer lista serializada desde el archivo
            listaD = (ArrayList<IngresoDocente>) ingreso.readObject();
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error en la lectura: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Ha ocurrido un error en la lectura: " + e.getMessage());
        }

        return listaD; // Retornar lista de ingresos leída del archivo
    }

    // Guarda una lista de ingresos de docentes en el archivo
    public void guardarIngresos(ArrayList<IngresoDocente> lista) {
        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Registro Docente.txt"))) {
            salida.writeObject(lista); // Serializar y guardar la lista
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al guardar archivo: " + e.getMessage());
        }
    }

    // Devuelve todos los ingresos de un docente específico según su código
    public ArrayList<IngresoDocente> obtenerPorCodigo(String codigo) {
        ArrayList<IngresoDocente> resultados = new ArrayList<>();
        for (IngresoDocente ingreso : leerIngresos()) {
            if (ingreso.getCodigo().equalsIgnoreCase(codigo)) {
                resultados.add(ingreso); // Agregar a la lista si coincide el código
            }
        }
        return resultados; // Retorna los ingresos encontrados
    }

    // Elimina un ingreso de docente según su código
    public boolean eliminarPorCodigo(String codigo) {
        ArrayList<IngresoDocente> lista = leerIngresos();
        boolean eliminado = false;

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getCodigo().equalsIgnoreCase(codigo)) {
                lista.remove(i); // Eliminar ingreso encontrado
                eliminado = true;
                break;
            }
        }

        if (eliminado) {
            guardarIngresos(lista); // Guardar la lista modificada
        }

        return eliminado; // Retornar si fue eliminado o no
    }

    // Devuelve un modelo de tabla con los datos de los ingresos para mostrar en una interfaz gráfica
    public DefaultTableModel getContenido() {
        DefaultTableModel modelo = new DefaultTableModel();
        String[] columnas = {
            "Nombres", "Apellidos", "DNI", "Edad",
            "Departamento", "Especialidad", "Codigo",
            "Tipo", "Fecha de Ingreso"
        };
        modelo.setColumnIdentifiers(columnas); // Establecer nombres de columnas

        ArrayList<IngresoDocente> lista = leerIngresos(); // Leer ingresos desde archivo
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
            fila[8] = profesor.getFechaIngresoCorta(); // Método que retorna fecha en formato corto
            modelo.addRow(fila); // Agregar fila al modelo de la tabla
        }

        return modelo; // Retornar el modelo para usarlo en la GUI
    }
}

