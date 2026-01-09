package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Qual operação você quer fazer: + - * / %");
        String operador = scanner.next();

        System.out.print(operador.equals("+") ? num1 + num2 : "");
        System.out.print(operador.equals("-") ? num1 - num2 : "");
        System.out.print(operador.equals("*") ? num1 * num2 : "");
        System.out.print(operador.equals("/") ? num1 / num2 : "");
        System.out.print(operador.equals("%") ? num1 % num2 : "");

        scanner.close();
    }
}
