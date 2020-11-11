public class SemFio extends Telefone {

    private double frequencia, distancia;
    private int canais;

    public SemFio(int codigo, String numSerie, String modelo, float peso, Dimensao dim, double frequencia, double distancia, int canais) {
        super(codigo, numSerie, modelo, peso, dim); // Invocando construtor da superclass
        this.frequencia = frequencia;
        this.distancia = distancia;
        this.canais = canais;
    }

    @Override
    public String toString() {
        return "SemFio{" +
                super.toString() +
                "frequencia=" + frequencia +
                ", distancia=" + distancia +
                ", canais=" + canais +
                '}';
    }

    @Override
    public void ola(){
        System.out.println("Ola, sou um telefone sem fio");
    }

    @Override
    public String olaMundo() {
        return super.olaMundo() + " sem fio";
    }

    public void ruido() {
        System.out.println("ruido");
    }

}
