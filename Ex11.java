import java.util.Scanner;

class MensalidadeEscolar {
    public static final double TAXA_MATRICULA = 150.00;

    public double calcularTotalPrimeiroMes(double mensalidadeBase) {
        return mensalidadeBase + TAXA_MATRICULA;
    }
}

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MensalidadeEscolar cobranca = new MensalidadeEscolar();

        System.out.print("Digite o valor base da mensalidade: ");
        double mensalidade = sc.nextDouble();

        double total = cobranca.calcularTotalPrimeiroMes(mensalidade);

        System.out.println("Total no primeiro mes (com matricula fixa de R$ 150): R$ " + total);

        sc.close();
    }
}
