package classe;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook", 2229.75);

        var p2 = new Produto();
        p2.nome = "Caneta Preta";
        p2.preco = 12.56;

        Produto.desconto = 0.50;

        System.out.println(p1.nome + " " + p1.precoComDesconto());
        System.out.println(p2.nome + " " + p2.precoComDesconto());

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto(0.1);
        double mediaCarinho = (precoFinal1 + precoFinal2) / 2;

        System.out.printf("A média da sua compra: R$%.2f\n", mediaCarinho);

    }
}
