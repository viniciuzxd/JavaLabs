package basico;
import java.util.Scanner;

public class Cofre {
    public static void main(String[] args) {
        String senhaCorreta = "java123";
                Scanner leitor = new Scanner(System.in);
        System.out.println("Bem-vindo ao Cofre Secreto!");
        System.out.print("Digite a senha para abrir o cofre: ");
        String senhaDigitada = leitor.nextLine();

        if (senhaDigitada.equals(senhaCorreta)) {
            System.out.println("Senha correta! O cofre está aberto. Parabéns!");
        } else {
            System.out.println("Senha incorreta! O cofre permanece fechado. Tente novamente.");
        }
        leitor.close();
    }
}
