package com.example;

public class Cliente {
    // Atributos (variables que almacena la clase)
    String nombre;
    int edad; // Dato primitivo
    String telefono; // Dato en envoltura
    String direccion;
    Integer compras_al_mes;

    // Metodos Especiales
    // 1. Contructor Vacio
    public Cliente(){
    }
    // 2. Constructor Lleno
    public Cliente(String nombre, int edad, String telefono, String direccion, Integer compras_al_mes){
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        this.direccion = direccion;
        this.compras_al_mes = compras_al_mes;
    }
    // Metodos Ordinarios
}
