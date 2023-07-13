import java.util.Scanner;

public class Potenciacion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        double base = scanner.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        double exponente = scanner.nextDouble();

        double resultado = Math.pow(base, exponente);

        System.out.print("El resultado es: " + resultado);

        scanner.close();
    }

}
