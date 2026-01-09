package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a quantidade de alunos: ");
        int qtdAlunos = scanner.nextInt();

        System.out.println("Informe a quantidade de notas por aluno: ");
        int qtdNotas = scanner.nextInt();

        double[][] notasDaturma = new double[qtdAlunos][qtdNotas];

        double total = 0;
        for (int i = 0; i < notasDaturma.length; i++) {
            for (int j = 0; j < notasDaturma[i].length; j++) {
                System.out.print("Informe a nota " + (j + 1) + " do aluno " + (i + 1) + ": ");
                notasDaturma[i][j] = scanner.nextDouble();
                total += notasDaturma[i][j];
            }
        }

        double media = total / (qtdAlunos * qtdNotas);
        System.out.println("A média da turma é " + media);

        for (double[] notasDoAluno : notasDaturma) {
            System.out.println(Arrays.toString(notasDoAluno));
        }

        scanner.close();
    }
}
