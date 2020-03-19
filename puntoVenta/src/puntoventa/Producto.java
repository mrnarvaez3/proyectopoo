/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntoventa;

/**
 *
 * @author rober
 */
public class Producto {

    
    public String nombre;
    protected String tipoProducto;
    protected int cantidad;
    protected double precio;

    public Producto(String nombre, String unidadMedida, int cantidad, double precio) {
        this.nombre = nombre;
        this.tipoProducto = unidadMedida;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    
    //------------------------------------------------------------------
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the tipoProducto
     */
    public String getTipoProducto() {
        return tipoProducto;
    }

    /**
     * @param unidadMedida the tipoProducto to set
     */
    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    


    
    
}
