package fundamentos.exerciciosConceitosBasicos;

import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        double a = scanner.nextDouble();
        System.out.println("Digite o valor de B: ");
        double b = scanner.nextDouble();
        System.out.println("Digite o valor de C: ");
        double c = scanner.nextDouble();

        double delta = Math.pow(b, 2) - (4 * a * c);
        if (delta > 0){
            double x1 = ((b * -1) + Math.sqrt(delta)) / (2*a);
            double x2 = ((b * -1) - Math.sqrt(delta)) / (2*a);
            System.out.printf("Tem duas raizes: X' = %.2f || X'' = %.2f", x1, x2);
        } else if (delta == 0) {
            double x = (b * -1) / (2 * a);
            System.out.printf("Tem uma raiz: X = %.2f", x);
        } else {
            System.out.println("Não há raízes reais (as raízes são complexas/imaginárias) e o gráfico não toca o eixo X. ");
        }


        scanner.close();
    }
}
