package basico;

public class Inversor {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Antes: a=" + a + " b=" + b);

        int c = a;
        a = b;
        b = c;
        System.out.println("Depois: a=" + a + " b=" + b);
    }
}