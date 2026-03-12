package cursoudemy.fundamentos;
import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = leitor.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = leitor.nextDouble();

        System.out.print("Digite a operação (+, -, *, /): ");
        String operacao = leitor.next();

        double resultado;

        switch (operacao) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                    leitor.close();
                    return;
                }
                break;
            default:
                System.out.println("Operação inválida. Use +, -, *, ou /.");
                leitor.close();
                return;
        }

        System.out.println("O resultado é: " + resultado);
        leitor.close();
    }

}
