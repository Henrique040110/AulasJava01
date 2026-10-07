package aula2.exercicios;

import java.util.Scanner;

public class exercicio10 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Variável short: ");
        short varShort = scanner.nextShort();

        int varInt = varShort;

        byte varByte = (byte) varShort;

        System.out.println("\nVariável int: " + varInt);
        System.out.println("Variável byte: " + varByte);
    }

}