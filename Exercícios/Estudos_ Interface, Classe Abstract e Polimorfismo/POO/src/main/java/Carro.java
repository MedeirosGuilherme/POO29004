public interface Carro {

    public static final String nome = "Carro";  // Não pode ter atributos

    public abstract void frear(int intensidade);

    default void desligar(){
        System.out.println("Desligando carro.");
    }
}
