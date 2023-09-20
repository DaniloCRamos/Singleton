// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Fila impressao1 = Fila.getInstance();
        Fila impressao2 = Fila.getInstance();

        impressao1.setComentario("TESTE");
        System.out.println(impressao2.getComentario());
    }
    //mudança so para aparecer o nome certo
}