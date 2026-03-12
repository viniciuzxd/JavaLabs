package CursosUdemy.fundamento;
import java.util.Scanner;

public class Conversao {
        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);

            System.out.print("Digite o primeiro salário: ");
            String s1 = leitor.nextLine().replace(",", ".");

            System.out.print("Digite o segundo salário: ");
            String s2 = leitor.nextLine().replace(",", ".");

            System.out.print("Digite o terceiro salário: ");
            String s3 = leitor.nextLine().replace(",", ".");

            double salario1 = Double.parseDouble(s1);
            double salario2 = Double.parseDouble(s2);
            double salario3 = Double.parseDouble(s3);

            double media = (salario1 + salario2 + salario3) / 3;

            System.out.println("A média dos seus últimos 3 salários é: R$ " + media);

            leitor.close();
        }
}
