public class Arqueiro extends Personagem {

    private int habilidade;

    public Arqueiro(int id, String nome, int habilidade) {
        super(id, nome);
        this.habilidade = habilidade;
    }

    @Override
    public void atacar(float intensidade) {
        System.out.println("Atacando com flecha com " + intensidade + " de força");
    }

    @Override
    public void mover() {
        System.out.println("Movendo em duas unidades");
    }
}
