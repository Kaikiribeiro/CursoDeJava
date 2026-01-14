package controle.exerciciosEstruturasDeControle;

import java.util.Scanner;

public class MaiorQueDez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número");
        double num = scanner.nextDouble();

        if (num >= 0 && num <= 10){
            System.out.println("O número está entre 0 e 10");
        } else {
            System.out.println("O número ou é menor que 0 ou maior que 10");
        }

        if (num % 2 == 0){
            System.out.println("Ele é par");
        } else {
            System.out.println("O número é impar");
        }

        scanner.close();
    }
}
