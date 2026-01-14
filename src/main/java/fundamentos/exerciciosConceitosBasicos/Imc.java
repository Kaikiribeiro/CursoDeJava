package fundamentos.exerciciosConceitosBasicos;

import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu peso: ");
        
        double peso = scanner.nextDouble();
        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f\n", imc);
            
        scanner.close();
    }
}
