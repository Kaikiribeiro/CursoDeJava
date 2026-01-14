package fundamentos.exerciciosConceitosBasicos;

import java.util.Scanner;

public class QuadradoECubo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor qualquer");
        double numero = scanner.nextDouble();

        double quadrado = Math.pow(numero, 2);
        double cubo = Math.pow(numero, 3);

        System.out.println("O quadrado de " + numero + " é: " + quadrado);
        System.out.println("O cubo de " + numero + " é: " + cubo);

        scanner.close();
    }
}