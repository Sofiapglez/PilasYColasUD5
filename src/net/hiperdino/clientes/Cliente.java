package net.hiperdino.clientes;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String apellidos;
    private String dni;
    private List<String> cestaCompra;

    public Cliente(String nombre, String apellidos, String dni, List<String> cestaCompra) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.cestaCompra = new ArrayList<>();
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
}
