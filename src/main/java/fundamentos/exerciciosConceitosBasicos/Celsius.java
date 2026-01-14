package fundamentos.exerciciosConceitosBasicos;

import java.util.Scanner;

public class Celsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius:");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9.0/5) + 32;
        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit + "°F");
        scanner.close();
    }
}
