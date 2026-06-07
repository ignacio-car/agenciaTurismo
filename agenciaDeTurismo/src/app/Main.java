package app;
import model.Direccion;
import model.Empleado;



public class Main {
    public static void main(String[] arg) {

        Direccion direccion1 = new Direccion("Lo Moreno ", 3023, "Santiago", "Metropolitana");
        Empleado empleado1 = new Empleado("Mateo Lagos", "15.335.226-5", "lagos.m@gmail.com", 923412784, direccion1, "Guia turistico", 10);

        Direccion direccion2 = new Direccion("Los Aromos", 1430, "La Serena", "Region de Coquimbo");
        Empleado empleado2 = new Empleado("Ignacio Carvacho", "18.558.334-7", "c.ignacio@gmail.com", 982758967, direccion2, "Asesor de viajes", 5);

        Direccion direccion3 = new Direccion("Adela Martinez", 1390, "Santiago", "Metropolitana");
        Empleado empleado3 = new Empleado("Nataly Gutierrez", "19.998.376-2", "nataly.g@gmail.com", 967480376, direccion3, "Encargado de reservas", 3);

        System.out.println("=== SISTEMA DE REGISTRO DE EMPLEADOS ===");
        System.out.println(empleado1);
        System.out.println("------------------------------");
        System.out.println(empleado2);
        System.out.println("------------------------------");
        System.out.println(empleado3);
    }



}