/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;
import entidades.IngresoProfesor;
import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author USUARIO
 */

public class ListaIngresosProfesor {
    private final String archivo = "ingresos_profesores.txt";

    public void agregarIngreso(IngresoProfesor ingreso) {
        ArrayList<IngresoProfesor> lista = leerIngresos();
        lista.add(ingreso);
        guardarIngresos(lista);
    }

    public ArrayList<IngresoProfesor> leerIngresos() {
        ArrayList<IngresoProfesor> lista = new ArrayList<>();
        File f = new File(archivo);
        if (!f.exists()) return lista;

        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(f))) {
            lista = (ArrayList<IngresoProfesor>) entrada.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("❌ Error al leer archivo: " + e.getMessage());
        }

        return lista;
    }
    
    public void guardarIngresos(ArrayList<IngresoProfesor> lista) {
        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(archivo))) {
            salida.writeObject(lista);
        } catch (IOException e) {
            System.out.println("❌ Error al guardar archivo: " + e.getMessage());
        }
    }

    
    public ArrayList<IngresoProfesor> obtenerPorCodigo(String codigo) {
    ArrayList<IngresoProfesor> resultados = new ArrayList<>();
    for (IngresoProfesor ingreso : leerIngresos()) {
        if (ingreso.getCodigo().equalsIgnoreCase(codigo)) {
            resultados.add(ingreso);
        }
    }
    return resultados;
    }
    public boolean eliminarPorCodigo(String codigo) {
    ArrayList<IngresoProfesor> lista = leerIngresos();
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

}

