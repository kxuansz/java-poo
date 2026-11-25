import java.util.Scanner;

class Endereco {
    String nomeRua;
    int numeroCasa;
}

class Cliente {
    String nomeCliente;
    Endereco enderecoResidencial;
}

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente cliente = new Cliente();
        cliente.enderecoResidencial = new Endereco();

        System.out.print("Digite o nome do cliente: ");
        cliente.nomeCliente = sc.nextLine();

        System.out.print("Digite o nome da rua: ");
        cliente.enderecoResidencial.nomeRua = sc.nextLine();

        System.out.print("Digite o numero da casa: ");
        cliente.enderecoResidencial.numeroCasa = sc.nextInt();

        System.out.println("Cliente: " + cliente.nomeCliente + " reside em: " +
                cliente.enderecoResidencial.nomeRua + ", " + cliente.enderecoResidencial.numeroCasa);

        sc.close();
    }
}
