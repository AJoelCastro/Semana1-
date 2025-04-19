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
    private static ArrayList<IngresoDocente> listaProfesor = new ArrayList<>();
    private final String archivo = "ingresos_profesores.txt";

    public void agregarIngreso(IngresoDocente ingreso) {
        listaProfesor.add(ingreso);
        guardarIngresos(listaProfesor);
    }

    public ArrayList<IngresoDocente> leerIngresos() {
        ArrayList<IngresoDocente> lista = new ArrayList<>();
        File f = new File(archivo);
        if (!f.exists()) return lista;

        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(f))) {
            lista = (ArrayList<IngresoDocente>) entrada.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("❌ Error al leer archivo: " + e.getMessage());
        }

        return lista;
    }
    
    public void guardarIngresos(ArrayList<IngresoDocente> lista) {
        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(archivo))) {
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
    public static DefaultTableModel getContenido() {
            IngresoDocente profesor;
            DefaultTableModel modelo = new DefaultTableModel();
            String columnas[] = {"Nombres","Apellidos", "DNI", "Edad", "Departamento", "Especialidad" ,"Codigo", "Tipo", "Fecha de Ingreso"};
            modelo.setColumnIdentifiers(columnas);
            for(int i=0; i<listaProfesor.size(); i++){
                profesor = listaProfesor.get(i);
                Object fila[] = new Object[columnas.length];
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
