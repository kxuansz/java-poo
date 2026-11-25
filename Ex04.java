import java.util.Scanner;

class Funcionario {
    String nomeFuncionario;
    double salarioBase;

    public Funcionario(String nome, double salario) {
        this.nomeFuncionario = nome;
        this.salarioBase = salario;
    }

    public double calcularSalarioTotal() {
        return salarioBase;
    }
}

class Gerente extends Funcionario {
    double gratificacaoGerencia;

    public Gerente(String nome, double salario, double gratificacao) {
        super(nome, salario);
        this.gratificacaoGerencia = gratificacao;
    }

    @Override
    public double calcularSalarioTotal() {
        return salarioBase + gratificacaoGerencia;
    }
}

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do gerente: ");
        String nome = sc.nextLine();

        System.out.print("Salario base: ");
        double salario = sc.nextDouble();

        System.out.print("Gratificacao de gerencia: ");
        double gratificacao = sc.nextDouble();

        Gerente lider = new Gerente(nome, salario, gratificacao);

        System.out.println("Salario total do gerente " + lider.nomeFuncionario + ": R$ " + lider.calcularSalarioTotal());

        sc.close();
    }
}
