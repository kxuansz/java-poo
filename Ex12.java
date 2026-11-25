import java.util.Scanner;

class Veiculo {
    String modeloCarro;
    int anoFabricacao;

    public Veiculo(String modelo) {
        this(modelo, 2024);
    }

    public Veiculo(String modelo, int ano) {
        this.modeloCarro = modelo;
        this.anoFabricacao = ano;
    }
}

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o modelo do veiculo: ");
        String modelo = sc.nextLine();

        System.out.print("Digite o ano de fabricacao: ");
        int ano = sc.nextInt();

        Veiculo carro = new Veiculo(modelo, ano);

        System.out.println("Veiculo cadastrado: " + carro.modeloCarro + " - Ano: " + carro.anoFabricacao);

        sc.close();
    }
}
