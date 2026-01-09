package controle;

import java.util.Scanner;

public class WhileInderterminado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = "";

        while (!s.equalsIgnoreCase("sair")) {
            System.out.println("Você diz: ");
            s = scanner.next();
        }

        scanner.close();
    }
}
