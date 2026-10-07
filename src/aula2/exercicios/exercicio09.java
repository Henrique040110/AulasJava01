package aula2.exercicios;

import java.util.Scanner;

public class exercicio09 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Valor fracionado: ");
        float valorFrac = scanner.nextFloat();

        scanner.nextLine();
        long valorLong = (long) valorFrac;

        scanner.nextLine();
        double valorDouble = valorLong;


        System.out.println("\nValor fracionado: " + valorFrac);
        System.out.println("Valor long: " + valorLong);
        System.out.println("Valor double: " + valorDouble);
    }
}