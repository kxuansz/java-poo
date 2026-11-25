import java.util.Scanner;

class Livro {
    String tituloLivro;
    String autorLivro;
    int anoPublicacao;

    public Livro(String titulo, String autor, int ano) {
        this.tituloLivro = titulo;
        this.autorLivro = autor;
        this.anoPublicacao = ano;
    }

    @Override
    public String toString() {
        return "Livro: \"" + tituloLivro + "\" por " + autorLivro + " (" + anoPublicacao + ")";
    }
}

public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Titulo do livro: ");
        String titulo = sc.nextLine();

        System.out.print("Autor do livro: ");
        String autor = sc.nextLine();

        System.out.print("Ano de publicacao: ");
        int ano = sc.nextInt();

        Livro obra = new Livro(titulo, autor, ano);
        System.out.println(obra);

        sc.close();
    }
}
