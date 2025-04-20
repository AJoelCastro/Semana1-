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
/**
 * Clase que gestiona una lista de estudiantes.
 * Permite agregar, eliminar, leer y guardar estudiantes en un archivo.
 */
public class ListaEstudiantes {

    public void añadirEstudianteHistorial (Estudiante nuevo){         // Agrega un nuevo estudiante al archivo de registro
        ArrayList <Estudiante> listaE = leerEstudiantes(); // Leer la lista actual desde archivo
        listaE.add(nuevo); // Agregar el nuevo estudiante a la lista
        guardarEstudiantes(listaE);  // Guardar la lista actualizada
    }
    
    public ArrayList<Estudiante> leerEstudiantes(){ // Lee los estudiantes almacenados desde el archivo 'Registro Estudiante.txt'
        ArrayList<Estudiante> listaE = new ArrayList<>(); 
        File f = new File("Registro Estudiante.txt");
        if(!f.exists()) 
            return listaE; // Si el archivo no existe, retorna una lista vacía
        try(ObjectInputStream ingreso = new ObjectInputStream(new FileInputStream("Registro Estudiante.txt"))) {
            // Leer el objeto serializado del archivo y convertirlo a lista de Estudiantes
            listaE = (ArrayList<Estudiante>)ingreso.readObject();
        }catch(IOException e) {
            System.out.println("Ha ocurrido un error en la lectura: " + e.getMessage());
        }catch(ClassNotFoundException e) {
            System.out.println("Ha ocurrido un error en la lectura: " + e.getMessage());
        }

        return listaE;
    }
    
    public void guardarEstudiantes(ArrayList<Estudiante> listaE){     // Guarda la lista de estudiantes en el archivo 'Registro Estudiante.txt'
        try(ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Registro Estudiante.txt"))) {  
        // Serializa y guarda el objeto lista en el archivo
            salida.writeObject(listaE);
        }catch(IOException e) {
            System.out.println("Ha ocurrido un error al guardar: " + e.getMessage());
        }
    }

    public boolean eliminarEstudiante(String codigo) {     // Elimina un estudiante del archivo usando su código
        ArrayList<Estudiante> lista = leerEstudiantes(); // Leer la lista actual
        boolean encontrado = false;
        String clave = codigo.trim(); // Quitar espacios extra del código
        for (int i = 0; i < lista.size(); i++) {             // Comparar ignorando mayúsculas y minúsculas
            if (lista.get(i).getCodigo().equalsIgnoreCase(clave)) {
                lista.remove(i); // Eliminar estudiante encontrado
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            guardarEstudiantes(lista); // Guardar la nueva lista si se modificó
        }
        return encontrado; // Devolver si se eliminó o no
    }
    

}
