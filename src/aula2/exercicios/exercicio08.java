package aula2.exercicios;

import java.util.Scanner;

public class exercicio08 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Largura do retângulo: ");
        float largura = scanner.nextFloat();

        scanner.nextLine();
        System.out.println("Altura do retângulo: ");
        float altura = scanner.nextFloat();

        System.out.println("Área do retângulo: " + largura*altura);
    }
}