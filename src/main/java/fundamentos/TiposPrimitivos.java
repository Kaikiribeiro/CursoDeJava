package fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {

        //Tipos Númericos inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 566789;
        long pontosAcumulados = 3_234_845_223L;

        //Tipo númericos reais
        float salario = 11_445.44F;
        double vendasAcumulados = 2_991_797_103.01;

        //Tipo booleano
        boolean estaDeFerias = false; //or true
        //Tipo de caractere
        char status = 'A'; //ativo

        // Dias de empresa
        System.out.println(anosDeEmpresa * 365);

        //Números de viagens
        System.out.println(numeroDeVoos / 2);

        //Pontos por real
        System.out.println(pontosAcumulados / vendasAcumulados);

        System.out.println(id + ": ganha -> " + salario);
        System.out.println("Férias? " + estaDeFerias);
        System.out.println("Status: " + status);

    }
}
