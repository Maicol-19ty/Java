package Clase2.Switch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Switch a = new Switch();
        Scanner lector = new Scanner(System.in);

        System.out.print("Ingrese una opcion:");
        a.option= lector.nextInt();

        System.out.printf(a.showOption());

    }
}
