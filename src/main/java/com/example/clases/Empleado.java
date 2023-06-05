package com.example.clases;
public class Empleado {

    private Double salario;
    public String nombre;
    //Metodos especiales
    //contructor vacio

    public Empleado(){
    }

    public Empleado(Double salario, String nombre){
        this.salario = salario;
        this.nombre = nombre;
    }

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

    public double getSalario(){
        return salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }

    public Double calcularSalario(Integer salarioBase, Integer deducciones){
        final Double descuentoSalud = 0.04;
        final double descuentoPension = 0.04;
        double descuentoSeguridadSocial = (salarioBase * descuentoSalud * descuentoPension);
        Double salarioTotal = salarioBase - deducciones - descuentoSeguridadSocial;

        return salarioTotal;
    }
}
