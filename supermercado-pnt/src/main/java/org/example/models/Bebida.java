package org.example.models;

/**
 * Clase que representa Bebidas, extendiendo la clase Producto.
 */
public class Bebida extends Producto {
    private double litros;

    public Bebida(String nombre, double precio, double litros) {
        super(nombre, precio);
        this.litros = litros;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " /// Litros: " + litros + " /// Precio: $" + String.format("%.0f", precio);
    }

}