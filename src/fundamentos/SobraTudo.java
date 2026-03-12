package fundamentos;

public class SobraTudo {
    public static void main(String[] args) {
        int fatias = 8;
        int pessoas = 3;

        int sobra = fatias % pessoas;

        System.out.println("Se dividirmos " + fatias + " fatias para " + pessoas + " amigos, sobrarão " + sobra + " fatias.");
    }
}
