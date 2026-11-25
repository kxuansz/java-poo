import java.util.Scanner;

class Dispositivo {
    String marcaDispositivo;
}

class Computador extends Dispositivo {
    int memoriaRamGb;
}

class Notebook extends Computador {
    double pesoEmKg;

    void exibirEspecificacoes() {
        System.out.println("Marca: " + marcaDispositivo + " | RAM: " + memoriaRamGb + "GB | Peso: " + pesoEmKg + "Kg");
    }
}

public class Ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Notebook note = new Notebook();

        System.out.print("Digite a marca do notebook: ");
        note.marcaDispositivo = sc.nextLine();

        System.out.print("Digite a quantidade de RAM (GB): ");
        note.memoriaRamGb = sc.nextInt();

        System.out.print("Digite o peso (Kg): ");
        note.pesoEmKg = sc.nextDouble();

        note.exibirEspecificacoes();

        sc.close();
    }
}
