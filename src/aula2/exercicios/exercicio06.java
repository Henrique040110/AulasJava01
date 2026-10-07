package aula2.exercicios;

import java.util.Scanner;

public class exercicio06 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Primeira variável: ");
        int variavel1 = scanner.nextInt();

        System.out.println("Segunda variável: ");
        int variavel2 = scanner.nextInt();

        if (variavel1 > variavel2) {
            System.out.println("Variável maior: " + variavel1);
        }
        else {
            System.out.println("Variável maior: " + variavel2);
        }
    }
}