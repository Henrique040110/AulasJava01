package aula2.exercicios;

import java.util.Scanner;

public class exercicio04 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Variável double: ");
        double variavelDouble = scanner.nextDouble();
        scanner.nextLine();
        int variavelInteira = (int) variavelDouble;

        System.out.println("\nVariável double: " + variavelDouble);
        System.out.println("\nVariável int: " + variavelInteira);

    }
}