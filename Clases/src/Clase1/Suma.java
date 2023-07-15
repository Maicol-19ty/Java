package Clase1;

import java.util.Scanner;

public class Suma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int numero2 = scanner.nextInt();

        int resultado = numero1 + numero2;
        System.out.print("El resultado es: " + resultado);

        scanner.close();
    }

}