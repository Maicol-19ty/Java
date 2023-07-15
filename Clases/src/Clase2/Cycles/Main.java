package Clase2.Cycles;

public class Main {
    public static void main(String[] args) {
        Cycle c1 = new Cycle();
        c1.start = 2;
        c1.end = 6;
        c1.showFor();

        Cycle c2 = new Cycle();
        c2.start = 1;
        c2.end = 5;
        c2.showWhile();

        Cycle c3 = new Cycle();
        c3.start = 2;
        c3.end = 10;
        c3.showDoWhile();

    }
}