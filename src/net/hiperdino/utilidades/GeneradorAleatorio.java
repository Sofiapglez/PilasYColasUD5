package net.hiperdino.utilidades;

import java.util.Random;

public class GeneradorAleatorio {
        private static final String[] productos = {
                "Producto 1", "Producto 2", "Producto 3","Producto 4",
                "Producto 5", "Producto 6", "Producto 7", "Producto 8",
                "Producto 9", "Producto 10", "Producto 11", "Producto 12",
        };

        public String obtenerProductoAleatorio() {
            Random random = new Random();
            int indice = random.nextInt(productos.length);
            return productos[indice];
        }

        private static final String[] nombres = {
                "Juan", "Ana", "Pedro", "María", "Luis",
                "Lucía", "Jorge", "Sofía", "Miguel", "Elena",
                "Fernando", "Carla", "Gabriel", "Lucas", "Laura",
                "Pablo", "Cristina", "Antonio", "Carmen", "Diego"
        };

        public static String obtenerNombreAleatorio() {
            Random random = new Random();
            int indice = random.nextInt(nombres.length);
            return nombres [indice];
        }
}
