package basico;
import java.util.Scanner;

public class Boletim {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a ultima nota do aluno: ");
        double nota = leitor.nextDouble();

        if (nota >= 7.0) {
            System.out.println("Parabéns! Você foi aprovado.");
        } else if (nota >= 5.0) {
            System.out.println("Você está de recuperação. Estude mais!");
        } else {
            System.out.println("Infelizmente, você foi reprovado. Tente novamente.");
        }
        leitor.close();
    }
}