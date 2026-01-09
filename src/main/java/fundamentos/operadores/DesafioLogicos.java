package fundamentos.operadores;

import java.util.Scanner;

public class DesafioLogicos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Trabalho de Terça deu certo? ");
        boolean t1 = scanner.nextBoolean();
        System.out.println("Trabalho de Quarta deu certo? ");
        boolean t2 = scanner.nextBoolean();

        boolean comprartv32 = t1 ^ t2;
        boolean comprartv50 = t1 && t2;
        boolean sorvete = comprartv50 || comprartv32;
        boolean ficouSaudavel = !sorvete;

        System.out.println("Comprou a TV de 32? " + comprartv32);
        System.out.println("Comprou a TV de 50? " + comprartv50);
        System.out.println("Tomou sorvete? " + sorvete);
        System.out.println("Esta saudável? " + ficouSaudavel);


        scanner.close();
    }
}
