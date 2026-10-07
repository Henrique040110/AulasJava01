package aula2.exercicios;

import java.util.Scanner;

public class exercicio03 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Variável inteira: ");
        int variavelInt = scanner.nextInt();
        System.out.println("Variável double: ");
        scanner.nextLine();
        double variavelDouble = scanner.nextInt();

        System.out.println("Variável double: " + variavelDouble);
    }
}