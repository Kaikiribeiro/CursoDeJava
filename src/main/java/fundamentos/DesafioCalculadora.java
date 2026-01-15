package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o 1° numero: ");
        double numero1 = scanner.nextDouble();
        System.out.println("Digite o 2° numero: ");
        double numero2 = scanner.nextDouble();
        System.out.println("Digite a operação: ");
        String operacao = scanner.next();
         double resultado = 0;

         resultado = operacao.equals("+") ? numero1 + numero2 : resultado;
         resultado = operacao.equals("-") ? numero1 - numero2 : resultado;
         resultado = operacao.equals("*") ? numero1 * numero2 : resultado;
         resultado = operacao.equals("/") ? numero1 / numero2 : resultado;
         resultado = operacao.equals("%") ? numero1 % numero2 : resultado;

        System.out.println("O resultado é: " + resultado);

        scanner.close();
    }
}
