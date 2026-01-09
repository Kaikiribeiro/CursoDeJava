package controle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String s = "";
        do {
            System.out.println("Você precisa digitar as palavras mágicas...");
            System.out.println("Quer sair? ");
            s = scanner.nextLine();
        } while (!s.equalsIgnoreCase("por favor"));

        System.out.println("Obrigado!");

        scanner.close();

    }
}
