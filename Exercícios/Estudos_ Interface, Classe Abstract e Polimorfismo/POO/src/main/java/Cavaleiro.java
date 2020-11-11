public class Cavaleiro extends Personagem {
    public Cavaleiro(int id, String nome) {
        super(id, nome);
    }

    @Override
    public void atacar(float intensidade) {
        System.out.println("Atacando com cavalo com " + intensidade + " de força");
    }

    @Override
    public void mover() {
        System.out.println("Movendo em dez unidades");
    }
}
