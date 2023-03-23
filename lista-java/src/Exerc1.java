import java.util.Scanner;

public class Exerc1 {
    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);

        int nota = 0;
        
        System.out.println("Digite um número de 1 a 10: ");
        do {
            nota = scan.nextInt();

            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida, digite novamente: ");
            }
        }
        while(nota < 0 || nota > 10);
        System.out.println("Nota: " + nota);

        
    }
}
