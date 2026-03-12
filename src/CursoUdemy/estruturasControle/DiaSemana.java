package cursoudemy.estruturasControle;
import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o dia da semana:");
        String dia = leitor.nextLine();

         if (dia.equalsIgnoreCase("domingo")) {
            System.out.println(1);
        } else if (dia.equalsIgnoreCase("segunda")) {
            System.out.println(2);
        } else if (dia.equalsIgnoreCase("terça")) {
            System.out.println(3);
        } else if (dia.equalsIgnoreCase("quarta")) {
            System.out.println(4);
        } else if (dia.equalsIgnoreCase("quinta")) {
            System.out.println(5);
        } else if (dia.equalsIgnoreCase("sexta")) {
            System.out.println(6);
        } else if (dia.equalsIgnoreCase("sábado")) {
            System.out.println(7);
        } else {
            System.out.println("Dia inválido");
    }
        leitor.close();
    }
}
