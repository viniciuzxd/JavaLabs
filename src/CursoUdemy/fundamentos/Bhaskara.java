package cursoudemy.fundamentos;
import java.util.Scanner;
// Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0) utilizando a fórmula de Bhaskara. Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta

public class Bhaskara {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        double a = leitor.nextDouble();

        System.out.print("Digite o valor de b: ");
        double b = leitor.nextDouble();

        System.out.print("Digite o valor de c: ");
        double c = leitor.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta < 0) {
            System.out.println("A equação não possui raízes reais.");
        } else {
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("As raízes da equação são: " + raiz1 + " e " + raiz2);
        }

        leitor.close();
    }
}
