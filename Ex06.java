import java.util.Scanner;

interface Autenticavel {
    boolean autenticar(String senhaInformada);
}

class UsuarioComum implements Autenticavel {
    private String senhaCadastrada = "1234";

    @Override
    public boolean autenticar(String senhaInformada) {
        return senhaCadastrada.equals(senhaInformada);
    }
}

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Autenticavel login = new UsuarioComum();

        System.out.print("Digite a senha de 4 digitos: ");
        String senha = sc.next();

        if (login.autenticar(senha)) {
            System.out.println("Acesso liberado ao usuario.");
        } else {
            System.out.println("Senha incorreta.");
        }

        sc.close();
    }
}
