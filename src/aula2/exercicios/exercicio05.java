package aula2.exercicios;

import java.util.Scanner;

public class exercicio05 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Primeira nota: ");
        double nota1 = scanner.nextDouble();

        scanner.nextLine();
        System.out.println("Segunda nota: ");
        double nota2 = scanner.nextDouble();

        scanner.nextLine();
        System.out.println("Terceira nota: ");
        double nota3 = scanner.nextDouble();

        System.out.println("Nota final: " + (nota1+nota2+nota3)/3);
    }
}