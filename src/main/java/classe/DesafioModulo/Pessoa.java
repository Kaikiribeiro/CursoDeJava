package classe.DesafioModulo;

public class Pessoa {
    String nome;
    double peso;

    public Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    void comer(Comida comida) {
        if (comida != null) {
            this.peso += comida.peso;
        }
    }

    String apresentar() {
        return "Oi meu nome é " + nome + " e tenho " + peso + "Kg.";
    }
}
