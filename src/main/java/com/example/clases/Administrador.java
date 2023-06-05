package com.example.clases;

public class Administrador {
    private String nombre;
    private Double salario;
    private String correo;
    private Boolean jornada;

    public Administrador(){}

    public Administrador(
    String nombre,
    Double salario,
    String correo,
    Boolean jornada){
    this.nombre = nombre;
    this.salario = salario;
    this.correo = correo;
    this.jornada = jornada;
    }

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public Double getSalario(){
        return this.salario;
    }

    public void setSalario(Double salario){
        this.salario = salario;
    }
}