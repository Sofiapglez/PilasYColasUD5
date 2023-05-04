package net.hiperdino;

import net.hiperdino.staff.Cajero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cajero cajero = new Cajero("Luis");
        Scanner scanner = new Scanner(System.in);
        boolean cajaAbierta = false;
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
                    }
            }
        }
    }
}