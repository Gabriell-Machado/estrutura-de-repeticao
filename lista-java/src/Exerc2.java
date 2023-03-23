import java.util.Scanner;

public class Exerc2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        String senha;

        do{
            System.out.println("Digite nome de úsuario: ");
            nome = scan.next();
            System.out.println("Digite sua senha: ");
            senha = scan.next();

            if (nome.equals(senha)) {
                System.out.println("Nome de úsuario não pode ser igual a senha, digite novamente: ");
            }
        } while (nome.equals(senha));
    }
}
