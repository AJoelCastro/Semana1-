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
    
    public ArrayList<Estudiante> leerEstudiantes(){
        ArrayList<Estudiante> listaE = new ArrayList<>();
        File f = new File("Registro Estudiante.txt");
        if(!f.exists()) 
            return listaE;
        try(ObjectInputStream ingreso = new ObjectInputStream(new FileInputStream("Registro Estudiante.txt"))) {
            listaE = (ArrayList<Estudiante>)ingreso.readObject();
        }catch(IOException e) {
            System.out.println("Ha ocurrido un error en la lectura: " + e.getMessage());
        }catch(ClassNotFoundException e) {
            System.out.println("Ha ocurrido un error en la lectura: " + e.getMessage());
        }

        return listaE;
    }
    
    public void guardarEstudiante(ArrayList<Estudiante> listaE){
        try(ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Registro Estudiante.txt"))) {
            salida.writeObject(listaE);
        }catch(IOException e) {
            System.out.println("Ha ocurrido un error al guardar: " + e.getMessage());
        }
    }
    
     public void añadirEstudianteHistorial(Estudiante nuevo){
        ArrayList<Estudiante> listaE = leerEstudiantes();
        listaE.add(nuevo);
        guardarEstudiante(listaE);
    }
}
