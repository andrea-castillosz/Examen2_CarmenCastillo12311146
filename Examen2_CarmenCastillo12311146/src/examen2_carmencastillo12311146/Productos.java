/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2_carmencastillo12311146;

/**
 *
 * @author casti
 */
public class Productos {
    
    private int idProd;
    private int cantidad;
    private String nombre;
    private double precio;
    private boolean estado;

    public Productos() {

        
        
        
    }
    
    public Productos (int idN, int cantidadN, String nombreN, double precioN){
        
        this.idProd = idN;
        this.cantidad = cantidadN;
        this.nombre = nombreN;
        this.precio = precioN;
        this.estado = cantidad > 0;
        
    }

    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.estado = cantidad > 0;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isEstado() {
        return estado;
    }

    public String getEstado() {
        if (estado) {
            return "Disponible";
        } else {
            return "Agotado";
        }
    }
    
    
    
}
