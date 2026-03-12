package CursosUdemy.fundamento;
import java.util.Scanner;

public class AreaTriang {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a base do triângulo: ");
        double base = leitor.nextDouble();

        System.out.print("Digite a altura do triângulo: ");
        double altura = leitor.nextDouble();

        double area = (base * altura) / 2;

        System.out.println("A área do triângulo é: " + area);

        leitor.close();
    }
}
