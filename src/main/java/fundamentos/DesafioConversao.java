package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o salário 1: ");
        String salario1 = scanner.nextLine().replace(",", ".");
        System.out.print("Digite o salário 2: ");
        String salario2 = scanner.nextLine().replace(",", ".");
        System.out.print("Digite o salário 3: ");
        String salario3 = scanner.nextLine().replace(",", ".");

        double v1 = Double.parseDouble(salario1);
        double v2 = Double.parseDouble(salario2);
        double v3 = Double.parseDouble(salario3);

        double media = (v1 + v2 + v3) / 3;

        System.out.println("A média do salario é: " + media);

        scanner.close();
    }
}
