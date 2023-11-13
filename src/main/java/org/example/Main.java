package org.example;

import org.example.models.ArticuloDeHigiene;
import org.example.models.Bebida;
import org.example.models.Fruta;
import org.example.services.SupermercadoServicio;

public class Main {

    public static void main(String[] args) {

        SupermercadoServicio supermercadoServicio = new SupermercadoServicio();

        supermercadoServicio.agregarProducto(new Bebida("Coca-Cola Zero", 20, 1.5));
        supermercadoServicio.agregarProducto(new Bebida("Coca-Cola", 18, 1.5));
        supermercadoServicio.agregarProducto(new ArticuloDeHigiene("Shampoo Sedal", 500, 19));
        supermercadoServicio.agregarProducto(new Fruta("Frutillas", 64, "kilo"));

        supermercadoServicio.imprimirProductos();
        supermercadoServicio.mostrarProductoMasCaroYBarato();
    }

}
