package org.example.models;

/**
 * Clase abstracta Producto que define la estructura y el comportamiento base de los productos.
 * Implementa la interfaz Comparable para permitir la comparación entre productos basada en el precio.
 */

public abstract class Producto implements Comparable<Producto> {
    protected String nombre;
    protected double precio;
    public Producto(String nombre,double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    public String getNombre() {
        return nombre;
    }
    public double getPrecio() {
        return precio;
    }
    @Override
    public int compareTo(Producto otro) {
        return Double.compare(this.precio, otro.precio);
    }
    @Override
    public String toString() {
        return "Nombre: " + nombre + " /// Litros: $" +precio;
    }
}
