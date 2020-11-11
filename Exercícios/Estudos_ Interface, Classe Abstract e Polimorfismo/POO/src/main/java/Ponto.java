public class Ponto extends FormaGeometrica {

    private int x;
    private int y;

    @Override
    public void desenhar() {
        System.out.println("Desenhando ponto: " + x + "," + y);
    }
}
