package aula2.exercicios;

import java.util.Scanner;

public class exercicio02 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantidade de horas trabalhadas: ");
        int horasTrabalhadas = scanner.nextInt();
        System.out.println("Valor por hora: ");
        scanner.nextLine();
        int valorHora = scanner.nextInt();

        System.out.println("\nSalário total: " + horasTrabalhadas*valorHora);
    }
}