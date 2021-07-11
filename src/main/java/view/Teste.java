package view;
import model.Inicio;

public class Teste {
    public static void main(String[] args) {
        final var A = new Inicio("Usuario", "Senha do Usuário");
        A.getLogin();
        A.getSenha();
        String Usuario = A.nome();

        System.out.print("\n\n" + A + "\n\n");

    }

}
