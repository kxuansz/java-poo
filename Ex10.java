import java.util.Scanner;

enum NivelPrioridade {
    BAIXA, MEDIA, ALTA, URGENTE
}

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a prioridade (BAIXA, MEDIA, ALTA, URGENTE): ");
        String entrada = sc.next().toUpperCase();

        NivelPrioridade prioridade = NivelPrioridade.valueOf(entrada);

        switch (prioridade) {
            case BAIXA:
                System.out.println("Atendimento em ate 48 horas.");
                break;
            case MEDIA:
                System.out.println("Atendimento em ate 24 horas.");
                break;
            case ALTA:
                System.out.println("Atendimento prioritario em ate 4 horas.");
                break;
            case URGENTE:
                System.out.println("Atendimento imediato!");
                break;
        }

        sc.close();
    }
}
