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
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){ // Validar que el nombre tenga minimo 4 letras
        if (nombre.length() < 4){
            System.out.println("El nombre debe tener al menos 4 letras");
        }
        else{
            this.nombre = nombre;
        }
    }

    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        if(edad < 0 && edad > 120){
            System.out.println("Un usuario no puede tener esa edad...");
        }
        else{
            this.edad = edad;
        }
    }

    public String getTelefono (){
        return telefono;
    }
    public void setTelefono(String telefono){ // validar que el telefono tenga 10 digitos
        if (10 > telefono.length() && telefono.length() < 10 ) {
            System.out.println("El telefono debe tener 10 digitos...");
        }
        else{
            this.telefono = telefono;
        }
    }

    public String getDireccion (){
        return direccion;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    public int getComprasalmes (){
        return compras_al_mes;
    }
    public void setComprasalmes(int comprasalmes){ // no existan compras negativas
        if(comprasalmes < 0){
            System.out.println("Debe tener al menos una compra...");
        }
        else{
            this.compras_al_mes = comprasalmes;
        }
    }

}