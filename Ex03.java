import java.util.Scanner;

class Produto {
    String descricaoProduto;
    double precoUnitario;
    int quantidadeEstoque;

    public Produto(String descricao, double preco, int estoque) {
        this.descricaoProduto = descricao;
        this.precoUnitario = preco;
        this.quantidadeEstoque = estoque;
    }

    public double calcularValorEstoque() {
        return precoUnitario * quantidadeEstoque;
    }
}

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nomeProduto = sc.nextLine();

        System.out.print("Digite o preco unitario: ");
        double preco = sc.nextDouble();

        System.out.print("Digite a quantidade em estoque: ");
        int estoque = sc.nextInt();

        Produto item = new Produto(nomeProduto, preco, estoque);

        System.out.println("Produto: " + item.descricaoProduto);
        System.out.println("Valor total em estoque: R$ " + item.calcularValorEstoque());

        sc.close();
    }
}
