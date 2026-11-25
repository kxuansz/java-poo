import java.util.Scanner;

interface Imprimivel {
    void imprimirDocumento();
}

interface Digitalizavel {
    void digitalizarDocumento();
}

class Multifuncional implements Imprimivel, Digitalizavel {
    String nomeDocumento;

    public Multifuncional(String nome) {
        this.nomeDocumento = nome;
    }

    @Override
    public void imprimirDocumento() {
        System.out.println("Imprimindo documento: " + nomeDocumento);
    }

    @Override
    public void digitalizarDocumento() {
        System.out.println("Digitalizando documento: " + nomeDocumento);
    }
}

public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do arquivo para o equipamento: ");
        String documento = sc.nextLine();

        Multifuncional aparelho = new Multifuncional(documento);
        aparelho.imprimirDocumento();
        aparelho.digitalizarDocumento();

        sc.close();
    }
}
