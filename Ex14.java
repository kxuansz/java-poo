import java.util.Objects;
import java.util.Scanner;

class ProdutoComparavel {
    int codigoIdentificador;
    String nomeProduto;

    public ProdutoComparavel(int codigo, String nome) {
        this.codigoIdentificador = codigo;
        this.nomeProduto = nome;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ProdutoComparavel outro = (ProdutoComparavel) obj;
        return codigoIdentificador == outro.codigoIdentificador;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoIdentificador);
    }
}

public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Codigo do primeiro produto: ");
        int cod1 = sc.nextInt();
        ProdutoComparavel prod1 = new ProdutoComparavel(cod1, "Item A");

        System.out.print("Codigo do segundo produto: ");
        int cod2 = sc.nextInt();
        ProdutoComparavel prod2 = new ProdutoComparavel(cod2, "Item B");

        if (prod1.equals(prod2)) {
            System.out.println("Os dois produtos sao considerados iguais pelo codigo!");
        } else {
            System.out.println("Produtos diferentes.");
        }

        sc.close();
    }
}
