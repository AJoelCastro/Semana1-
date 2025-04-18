/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;
import java.io.*;
import java.util.*;
import entidades.*;
/**
 *
 * @author USER
 */
public class ListaEstudiantes {
    private final String archivo= "Estudiantes.txt";
    
    public void agregarEstudiante (Estudiante nuevo){
        ArrayList <Estudiante> lista = leerEstudiantes();
        lista.add(nuevo);
        guardarEstudiantes(lista);
    }
    
    public ArrayList<Estudiante> leerEstudiantes(){
        ArrayList<Estudiante> lista = new ArrayList<>();
        File f = new File (archivo);
        if(!f.exists()) return lista;
        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(archivo))) {
            lista = (ArrayList<Estudiante>) entrada.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("❌ Error al leer: " + e.getMessage());
        }

        return lista;
    }
    
    public void guardarEstudiantes(ArrayList <Estudiante> lista){
        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(archivo))) {
            salida.writeObject(lista);
        } catch (IOException e) {
            System.out.println("❌ Error al guardar: " + e.getMessage());
        }
    }
    public boolean eliminarEstudiante(String codigo) {
        ArrayList<Estudiante> lista = leerEstudiantes();
        boolean encontrado = false;
        String clave = codigo.trim();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getCodigo().equalsIgnoreCase(clave)) {
                lista.remove(i);
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            guardarEstudiantes(lista);
        }
        return encontrado;
    }
    
}
