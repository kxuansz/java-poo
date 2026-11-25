import java.util.Scanner;

class ContaBancaria {
    private double saldoAtual;

    public double getSaldoAtual() {
        return saldoAtual;
    }

    public void depositar(double valorDeposito) {
        if (valorDeposito > 0) {
            saldoAtual += valorDeposito;
            System.out.println("Deposito realizado com sucesso!");
        } else {
            System.out.println("Valor invalido para deposito.");
        }
    }

    public void sacar(double valorSaque) {
        if (valorSaque > 0 && valorSaque <= saldoAtual) {
            saldoAtual -= valorSaque;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente ou valor invalido.");
        }
    }
}

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();

        System.out.print("Digite o valor para deposito inicial: ");
        double depositoInicial = sc.nextDouble();
        conta.depositar(depositoInicial);

        System.out.print("Digite o valor para saque: ");
        double saqueDesejado = sc.nextDouble();
        conta.sacar(saqueDesejado);

        System.out.println("Saldo final em conta: R$ " + conta.getSaldoAtual());

        sc.close();
    }
}
