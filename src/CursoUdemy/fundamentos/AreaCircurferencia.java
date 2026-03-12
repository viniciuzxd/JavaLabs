package CursosUdemy.fundamento;

public class AreaCircurferencia {
    public static void main(String[] args) {
        double raio = 3.4;
        final double PI = 3.14159;

        double area = PI * Math.pow(raio, 2);
        System.out.println("A área da circunferência é: " + area);
    }
}
