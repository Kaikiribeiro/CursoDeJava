package fundamentos;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("Olá Pessoal".charAt(2));

        String s = "Boa tarde";

        System.out.println(s.concat("!!!!"));
        System.out.println(s + "!!!!");
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.toUpperCase().endsWith("TARDE"));
        System.out.println(s.length());
        System.out.println(s.equals("boa tarde"));
        System.out.println(s.toLowerCase().equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 38;
        var salario = 12345.987;

        String maisUmaFrase = "\nNome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario: " + salario;
        System.out.println(maisUmaFrase);
        System.out.println("\nNome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario: " + salario);

        System.out.printf("\nNome: %s %s tem %d anos e ganha R$%.2f. ", nome, sobrenome, idade, salario);

        String frase = String.format("\nNome: %s %s tem %d anos e ganha R$%.2f. ", nome, sobrenome, idade, salario);
        //%s String
        //%d inteiros
        //% pontos flutuantes

        System.out.println(frase);

        System.out.println("Frase Qualquer"); //após " coloque um . para ver mais opções

    }
}
