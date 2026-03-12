package CursosUdemy.fundamento;

public class DesafioAritmetico {
    public static void main(String[] args) {

        // Parte 1: ([6 * (3 + 2)] ^ 2) / (3 * 2)
        double numA = Math.pow(6 * (3 + 2), 2);
        double denA = 3 * 2;
        double superiorA = numA / denA;

        // Parte 2: ((1 - 5) * (2 - 7) / 2) ^ 2
        double superiorB = Math.pow(((1 - 5) * (2 - 7)) / 2.0, 2);

        // Parte 3: (superiorA - superiorB) ^ 3
        double superiorTotal = Math.pow(superiorA - superiorB, 3);

        // Parte 4: Final (superiorTotal / 10 ^ 3)
        double inferiorTotal = Math.pow(10, 3);

        double resultado = superiorTotal / inferiorTotal;

        System.out.println("O resultado final é: " + resultado);
    }
}