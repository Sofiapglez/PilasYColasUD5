package net.hiperdino.clientes;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String apellidos;
    private String dni;
    private List<String> cestaCompra;

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDni() {
        return dni;
    }

    public Cliente(String nombre, String apellidos, String dni, List<String> cestaCompra) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.cestaCompra = new ArrayList<>();
    }

    public Cliente(String nombre) {
    }

    public void agregarProductoACesta(String producto) {
        cestaCompra.add(producto);
    }

    public void eliminarProductoDeCesta(String producto) {
        cestaCompra.remove(producto);
    }

    public List <String> getCestaCompra() {
        return cestaCompra;
    }

    @Override
    public String toString() {
        String listaProductos = "";
        for (String producto : cestaCompra) {
            listaProductos += producto + "\n";
        }
        return "Cliente\n" +
                "=========================================\n" +
                "* Nombre: " + nombre + "\n" +
                "* Total de productos: " +  cestaCompra.size() + "\n" +
                "*Lista de artículos en la cesta_\n" + listaProductos +
                "=========================================";
    }
}
