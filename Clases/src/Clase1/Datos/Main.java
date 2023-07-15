package Clase1.Datos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese la edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese el correo: ");
        String correo = scanner.nextLine();

        Persona persona = new Persona(nombre, edad, correo);

        System.out.println("\nDatos de la persona");
        System.out.println("==================");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Correo: " + persona.getCorreo());
        System.out.println("==================");

        scanner.close();

    }
}
