package aula2.exercicios;

import java.util.Scanner;

public class exercicio07 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Primeira condição: ");
        boolean cond1 = scanner.hasNext();

        scanner.nextLine();
        System.out.println("Segunda condição: ");
        boolean cond2 = scanner.hasNext();

        scanner.nextLine();
        System.out.println("Terceira condição: ");
        boolean cond3 = scanner.hasNext();

        if (cond1 && cond2 || cond3){
            System.out.println("Primeira condição: " + cond1);
            System.out.println("Segunda condição: " + cond2);
            System.out.println("Terceira condição: " + cond3);
        }
    }
}