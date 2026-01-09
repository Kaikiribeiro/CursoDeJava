package fundamentos;

public class Temperatura {
    public static void main(String[] args) {
        final int AJUSTE = 32;
        //na operação abaixo só funciona 5.0/9.0 || 5.0/9 || 5/9.0
        final double FATOR = 5.0 / 9.0;

        double fahrenheit = 86.0;
        double c = (fahrenheit - AJUSTE) * FATOR;
        System.out.println("A temperatura 1 convertida é " + c + " °C.");

        fahrenheit = 150.0;
        c = (fahrenheit - AJUSTE) * FATOR;
        System.out.println("A temperatura 2 convertida é " + c + " °C.");

    }
}
