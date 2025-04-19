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
    public static DefaultTableModel getContenido2() {
            Ventas ventas;
            DefaultTableModel modelo = new DefaultTableModel();
            String dCliente;
            String columnas[] = {"Código", "Marca", "Modelo", "Año de fabricación", "Precio total", "C/S Descuento"};
            modelo.setColumnIdentifiers(columnas);
            dCliente = getDniCliente();
            for(int i=0; i<listaVentas.size(); i++){
                if(listaVentas.get(i).getCliente().getNumeroDni().equals(dCliente)) {
                    ventas = listaVentas.get(i);
                    Object fila[] = new Object[columnas.length];
                    fila[0] = ventas.getAutomovil().getCodigo();
                    fila[1] = ventas.getAutomovil().getMarca();
                    fila[2] = ventas.getAutomovil().getModelo();
                    fila[3] = ventas.getAutomovil().getAñoDeFabricacion();
                    fila[4] = ventas.getAutomovil().getPrecioTotal();
                    boolean dcto = ventas.getAutomovil().isDcto();
                    fila[5] = (dcto == true? "Con descuento del " + ventas.getAutomovil().getPctjeDcto() + " %":"Sin descuento");
                    modelo.addRow(fila);
                }
            }
            return modelo;
        }
}
