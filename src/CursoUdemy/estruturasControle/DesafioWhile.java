package cursoudemy.estruturasControle;
import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int quantidadenotas = 0;
        double nota = 0;
        double total = 0;

        while (nota != -1) {
            System.out.println("Informe a nota: ");
            nota = leitor.nextDouble();

            if (nota <= 10 && nota >= 0) {
                total += nota;
                quantidadenotas++;
            } else if (nota != -1) {
                System.out.println("Nota inválida, digite novamente.");
            }

            // calcular media geral
            double media = total / quantidadenotas;
            System.out.println("Média geral: " + media);
        }
            leitor.close();
    }
}