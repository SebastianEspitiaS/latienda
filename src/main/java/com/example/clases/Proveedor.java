package com.example.clases;

public class Proveedor {
    private Integer id;
    private String nombre;
    private String nit;
    private String descripcion;
    private String direccion;

    public Proveedor(){
    }

    public Proveedor(
        Integer id,
        String nombre,
        String nit,
        String descripcion,
        String direccion
    ){
        this.id = id;
        this.nit = nit;
        this.descripcion = descripcion;
        this.direccion = direccion;
    }
    
}
