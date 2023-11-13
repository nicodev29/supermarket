package org.example.services;

import org.example.models.Producto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SupermercadoServicio {

    private List<Producto> productos;
    public SupermercadoServicio() {
        productos = new ArrayList<>();

    }
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    public void imprimirProductos() {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
    public void mostrarProductoMasCaroYBarato() {
        Producto masCaro = Collections.max(productos);
        Producto masBarato = Collections.min(productos);

        System.out.println("=============================");
        System.out.println("Producto más caro: " + masCaro.getNombre());
        System.out.println("Producto más barato: " + masBarato.getNombre());
    }
}

