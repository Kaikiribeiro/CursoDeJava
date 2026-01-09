package classe;

public class Jantar {
    public static void main(String[] args) {
        Comida comida1 = new Comida("Feijão", 0.180);
        Comida comida2 = new Comida("Arroz", 0.300);

        Pessoa p = new Pessoa("João", 99.8);
        System.out.println(p.apresentar());
        p.comer(comida1);

        System.out.println(p.apresentar());
        p.comer(comida2);
        System.out.println(p.apresentar());
    }
}
