package com.example;
import java.util.Scanner;
public class App
{
    public static void main( String[] args )
    {
        // Dentro del metodo main escribo mi programa y creo los objetos
        // Creando nuestro primer objeto
        Cliente cliente1 = new Cliente();
        Scanner entradaTeclado = new Scanner(System.in);
        //Pidiendo nombre a usuario
        System.out.print("Digita tu nombre: ");
        cliente1.setNombre(entradaTeclado.nextLine());
        System.out.println(cliente1.getNombre());





        /*El objeto se usa para acceder a los metodos de la clase por separado*/
        // cliente1.edad = 21;
        // cliente1.nombre = "Sebastian Espitia Sanchez";
        // System.out.println(cliente1.edad);
        // System.out.println(cliente1.nombre);

        // Creando un objeto utilizando un constructor lleno
        // Cliente cliente2 = new Cliente("vanessa", 19, "3155363185", "cll 50", 10);
        // System.out.println(cliente2.direccion);

        // //creando un objeto de la clase empleado
        // Empleado empleado1 = new Empleado();
        // System.out.println(empleado1.nombre);

        // Los objetos son instancias de una clase
        // Los objetos son variables para poder inicializar

    }
}
