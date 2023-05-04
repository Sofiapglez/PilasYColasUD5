package net.hiperdino.staff;

import net.hiperdino.clientes.Cliente;

import java.util.LinkedList;
import java.util.Queue;

public class Cajero {
    private String nombre;
    private String id;
    private int salario;
    private int numeroCaja;
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

    public int longitudFilaClientes() {
    return filaClientes.size();
    }

    @Override
    public String toString() {
        String listaClientes = "";
        for (Cliente cliente : filaClientes) {
            listaClientes += this.nombre + "\n";
        }
        return "Cajero\n" +
                "===================================\n" +
                "* Número de caja: " + numeroCaja + "\n" +
                "* Total de clientes: " + +filaClientes.size() + "\n" +
                "* Cliente en la fila:\n" + listaClientes +
                "===================================\n";
    }
}

