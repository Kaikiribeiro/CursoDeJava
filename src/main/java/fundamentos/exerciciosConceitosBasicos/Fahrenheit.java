package fundamentos.exerciciosConceitosBasicos;

import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura em Fahrenheit:");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("A temperatura em Celsius é: " + celsius + "°C");
        scanner.close();
    }
}
