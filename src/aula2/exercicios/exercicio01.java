package aula2.exercicios;

import java.util.Scanner;

public class exercicio01 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Digite sua altura: ");
        scanner.nextLine();
        float altura = scanner.nextFloat();
        System.out.println("Digite seu peso: ");
        scanner.nextLine();
        double peso = scanner.nextDouble();

        System.out.println("Sua idade é: " + idade);
        System.out.println("Sua altura é: " + altura);
        System.out.println("Seu peso é: " + peso);
    }
}