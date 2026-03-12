package basico;
import java.util.Scanner;

public class Entrevistador {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual seu filme de terror favorito? ");
        String filme = leitor.nextLine();

        System.out.println("Otima escolha! " + filme + " é realmente um clássico do terror.");
        leitor.close();
    }
}
