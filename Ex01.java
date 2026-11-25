import java.util.Scanner;

class Pessoa {
    String nomeCompleto;
    int idadePessoa;

    void exibirDados() {
        System.out.println("Nome: " + nomeCompleto + " | Idade: " + idadePessoa + " anos");
    }
}

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa individuo = new Pessoa();

        System.out.print("Digite o nome da pessoa: ");
        individuo.nomeCompleto = sc.nextLine();

        System.out.print("Digite a idade da pessoa: ");
        individuo.idadePessoa = sc.nextInt();

        individuo.exibirDados();

        sc.close();
    }
}
