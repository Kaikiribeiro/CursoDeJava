package fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        System.out.print("Bom");
        System.out.print("dia!\n\n");

        System.out.println("Bom");
        System.out.println("dia!");

        System.out.printf("Megasena: %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6);
        System.out.printf("Salário: %.1f\n", 12213.43);
        System.out.printf("Nome: %s \n", "João");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Escreva seu Sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.println("Escreva sua Idade: ");
        int idade = scanner.nextInt();

        System.out.printf("Seu nome: %s %s tem %d anos", nome, sobrenome, idade);
        scanner.close();
    }
}
