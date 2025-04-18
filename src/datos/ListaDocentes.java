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
 * @author Administrador
 */
public class ListaDocentes {
    
    public ArrayList<Docente> leerDocentes() {
        ArrayList<Docente> listaD = new ArrayList<>();
        File archivo = new File("Registro Docente.txt");
        if(archivo.exists())
            return listaD;
        try(ObjectInputStream ingreso = new ObjectInputStream(new FileInputStream("Registro Docente.txt"))) {
            listaD = (ArrayList<Docente>) ingreso.readObject();
        }catch(IOException e){
            System.out.println("Ha ocurrido un error en la lectura: " + e.getMessage());
        }catch(ClassNotFoundException e){
            System.out.println("Ha ocurrido un error en la lectura: " + e.getMessage());
        }
 
        return listaD;
    }
    
}
