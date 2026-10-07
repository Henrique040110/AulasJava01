package aula2;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Sua idade é: " + idade);

        System.out.println("Digite seu nome: ");
        scanner.nextLine();
        String nome = scanner.nextLine();

        System.out.println("Seu nome é: " + nome);

        scanner.close();
    }
}