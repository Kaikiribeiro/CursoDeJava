package fundamentos.exerciciosConceitosBasicos;

import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a base do triângulo: ");
        double base = scanner.nextDouble();
        System.out.println("Digite a altura do triângulo: ");
        double altura = scanner.nextDouble();

        double area = (base * altura) / 2;

        System.out.printf("A área do triângulo é: %.2f\n", area);

        scanner.close();
    }
}
