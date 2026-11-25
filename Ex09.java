import java.util.Scanner;

class ConversorMoeda {
    public static double converterDolarParaReal(double quantidadeDolares, double taxaCotacao) {
        return quantidadeDolares * taxaCotacao;
    }
}

public class Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade em dolares: ");
        double dolares = sc.nextDouble();

        System.out.print("Digite a cotacao do dolar: ");
        double cotacao = sc.nextDouble();

        double totalReais = ConversorMoeda.converterDolarParaReal(dolares, cotacao);

        System.out.println("Valor total convertido: R$ " + totalReais);

        sc.close();
    }
}
