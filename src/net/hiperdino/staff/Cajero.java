package net.hiperdino.staff;

import net.hiperdino.clientes.Cliente;

import java.util.LinkedList;
import java.util.Queue;

public class Cajero {
    private String nombre;
    private Queue<Cliente> filaClientes;

    public Cajero(String nombre) {
        this.nombre = nombre;
        this.filaClientes = new LinkedList<>();
    }

    public void agregarCliente(Cliente cliente) {
        filaClientes.add(cliente);
    }

    public Cliente atenderCliente() {
        return filaClientes.poll();
    }

    public int getSizeFilaClientes() {
        return filaClientes.size();
    }
}

