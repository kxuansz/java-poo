import java.util.Scanner;

class Estudante {
    String nomeEstudante;
    double notaFinal;

    public Estudante(String nome, double nota) {
        this.nomeEstudante = nome;
        this.notaFinal = nota;
    }
}

public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estudante[] turma = new Estudante[3];

        for (int i = 0; i < turma.length; i++) {
            System.out.print("Nome do estudante " + (i + 1) + ": ");
            String nome = sc.next();
            System.out.print("Nota final: ");
            double nota = sc.nextDouble();
            turma[i] = new Estudante(nome, nota);
        }

        double somaNotas = 0.0;
        for (Estudante estudanteAtual : turma) {
            somaNotas += estudanteAtual.notaFinal;
        }

        double mediaTurma = somaNotas / turma.length;
        System.out.println("Media final da turma: " + mediaTurma);

        sc.close();
    }
}
