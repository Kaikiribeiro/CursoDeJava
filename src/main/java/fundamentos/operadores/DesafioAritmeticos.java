package fundamentos.operadores;

public class DesafioAritmeticos {
    public static void main(String[] args) {

        double a1 = (3 + 2) * 6;
        a1 = Math.pow(a1, 2);
        double a2 = 3 * 2;
        double a3 = (a1 / a2);


        double b1 = (1 - 5) * (2 - 7) / 2;
        b1 = Math.pow(b1, 2);

        double c1 = a3 - b1;
        c1 = Math.pow(c1, 3);

        double d1 = Math.pow(10, 3);

        double resposta = c1 / d1;

        System.out.println(resposta);


    }
}
