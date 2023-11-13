package org.example.models;

/**
 * Clase que representa una Articulos de Higiene, extendiendo la clase Producto.
 */
public class ArticuloDeHigiene extends Producto {
    private int contenidoMl;
    public ArticuloDeHigiene(String nombre, int contenidoMl,double precio ) {
        super(nombre, precio);
        this.contenidoMl = contenidoMl;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " /// Contenido: " + contenidoMl + "ml /// Precio: $" + String.format("%.0f", precio);
    }

}
