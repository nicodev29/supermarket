package org.example.models;

/**
 * Clase que representa una Fruta, extendiendo la clase Producto.
 */
public class Fruta extends Producto {
    private String unidadDeVenta;

    public Fruta(String nombre, double precio, String unidadDeVenta) {
        super(nombre, precio);
        this.unidadDeVenta = unidadDeVenta;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " /// Precio: $" + String.format("%.0f", precio) + " /// Unidad de venta: " + unidadDeVenta;
    }


}
