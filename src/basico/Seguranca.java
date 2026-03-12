package fundamentos;
import java.util.Scanner;

public class Seguranca {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual sua idade? ");
        int idade = leitor.nextInt();

        if (idade >= 18) {
            System.out.println("Você é maior de idade. Bem-vindo!");
        } else {
            System.out.println("Desculpe, você precisa ser maior de idade para acessar este conteúdo.");
        }
        leitor.close();
    }
}