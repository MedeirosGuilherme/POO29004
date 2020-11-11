public class Triatleta extends Pessoa implements Corredor, Ciclista, Nadador {
    public Triatleta(String nome) {
        super(nome);
    }

    @Override
    public void pedalar() {
        System.out.println("Peladando...");
    }

    @Override
    public void correr() {
        System.out.println("Correndo...");
    }

    @Override
    public void nadar() {
        System.out.println("Nadando...");
    }
}
