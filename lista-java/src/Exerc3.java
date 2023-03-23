import java.util.Scanner;

public class Exerc3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade = 0;
        double salario = 0;
        String sexo;
        String estadoCivil;

        do {
            System.out.println("Digite seu nome: ");
            nome = scan.next();
        } while (nome.length() <= 3);
        do{
            System.out.println("Digite sua idade: ");
            idade = scan.nextInt();
        } while (idade < 0 || idade > 150);
        do {
            System.out.println("Digite seu salário: ");
            salario = scan.nextDouble();
        } while (salario <= 0);
        do{
            System.out.println("Digite seu sexo: (Apenas a primeira letra)");
            sexo = scan.next();
        } while (!sexo.equals("f") && !sexo.equals("m"));
        do {
            System.out.println("Digite seu estado civil: (Apenas a primeira letra)");
            estadoCivil = scan.next();
        } while (!estadoCivil.equals("s") && !estadoCivil.equals("c") && !estadoCivil.equals("v") && !estadoCivil.equals("d"));
    }
}
