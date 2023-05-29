package com.example.clases;
public class Empleado {

    private Integer salario;
    public String nombre;

    //Metodos especiales
    //contructor vacio
    public Empleado(){
    }

    public Empleado(Integer salario, String nombre){
        this.salario = salario;
        this.nombre = nombre;
    }
}
