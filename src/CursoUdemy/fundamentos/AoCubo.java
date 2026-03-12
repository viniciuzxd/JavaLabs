package CursosUdemy.fundamento;
import java.util.Scanner;

public class AoCubo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número para calcular seu valor ao quadrado e ao cubo: ");
        double numero = leitor.nextDouble();

        double quadrado = Math.pow(numero, 2);
        double cubo = Math.pow(numero, 3);

        System.out.println("O cubo de " + numero + " é: " + cubo);
        System.out.println("O quadrado de " + numero + " é: " + quadrado);

        leitor.close();
    }
}
