package controle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double nota = 0;
        double total = 0;
        int i = 0;

        while (nota != -1) {
            System.out.println("Digite uma nota (ou -1 p/ sair): ");
            nota = scanner.nextDouble();
            if (nota <= 10 && nota >= 0) {
                total += nota;
                i++;
            } else if (nota != -1) {
                System.out.println("Nota Inválida!!");
            }
        }
        System.out.println("A média da turma é: " + total / i);
    }
}
