package arrays;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de notas: ");
        int qtdNotas = scanner.nextInt();

        double[] notas = new double[qtdNotas];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota " + (i + 1) + ":");
            notas[i] = scanner.nextDouble();
        }

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }

        double media = soma / notas.length;

        System.out.println("A média é: " + media);

        scanner.close();
    }
}
