package basico;

public class CalculadoraMental {
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 4;

        int soma = num1 + num2;
        int sub = num1 - num2;
        int mult = num1 * num2;
        int div = num1 / num2;

        System.out.println("O valor da soma: " + soma);
        System.out.println("O valor da subtração: " + sub);
        System.out.println("O valor da multiplicação: " + mult);
        System.out.println("O valor da divisão: " + div);
    }
}