package net.hiperdino;

import net.hiperdino.clientes.Cliente;
import net.hiperdino.staff.Cajero;
import net.hiperdino.utilidades.GeneradorAleatorio;

import javax.swing.text.Utilities;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cajero cajero = new Cajero("Luis");
        Scanner scanner = new Scanner(System.in);
        boolean cajaAbierta = true;
        boolean salir = false;

        while (!salir) {
            System.out.println("Escoge una opción:  ");
            System.out.println("1. Abrir caja");
            System.out.println("2. Añadir un nuevo cliente a la cola");
            System.out.println("3. Atender un cliente");
            System.out.println("4. Ver clientes pendientes");
            System.out.println("5. Cerrar supermercado");

            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    if (cajaAbierta) {
                        System.out.println("La caja ya está abierta");
                    } else {
                        cajaAbierta = true;
                        cajero.abrirCaja();
                    }
                    break;
                case 2:
                    if (cajaAbierta) {
                        Cliente nuevoCLiente = new Cliente(GeneradorAleatorio.obtenerNombreAleatorio());
                        cajero.agregarCliente(nuevoCLiente);
                        System.out.println("Nuevo cliente añadido a la cola");
                        System.out.println(nuevoCLiente);
                    } else {
                        System.out.println("Caja cerrada");
                    }
                    break;
                case 3:
                    if (cajero.hayClientesEnCola()) {
                        Cliente clienteAtendido = cajero.atenderCliente();
                        System.out.println("Cliente atendido");
                        System.out.println(clienteAtendido);
                    } else {
                        System.out.println("No hay cliente que atender");
                    }
                    break;
                case 4:
                    if (cajero.hayClientesEnCola()) {
                        System.out.println("Clientes en la cola del cajero "+ cajero.getNumeroCaja());
                        for (Cliente cliente : cajero.getFilaClientes()) {
                            System.out.println(cliente.getNombre());
                        }
                    } else {
                        System.out.println("No hay clientes pendientes en la cola");
                    }
                    break;
            case 5:
                if (cajaAbierta) {
                    cajero.cerrarCaja();
                    cajaAbierta = false;
                } else {
                    System.out.println("La caja ya está cerrada");
                }
                salir = true;
                break;
            default:
                    System.out.println("Elige una opción");

            }
        }
    }
}