package fundamentos;

public class Gritador {
    public static void main(String[] args) {
        String frase = "Cuidado com o buraco!";
        String grito = frase.toUpperCase();

        System.out.println("- " + frase);
        System.out.println("- Fala mais alto para te escutarem lá do outro lado da rua - disse um estranho.");
        System.out.println("- " + grito);
    }
}
